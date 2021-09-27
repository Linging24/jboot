package com.linging.gen;

import com.jfinal.kit.PathKit;
import io.jboot.app.JbootApplication;
import io.jboot.codegen.model.JbootBaseModelGenerator;
import io.jboot.codegen.model.JbootModelGenerator;
import io.jboot.codegen.service.JbootServiceImplGenerator;
import io.jboot.codegen.service.JbootServiceInterfaceGenerator;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
public class GenController {

    public static void main(String[] args) {
        // 配置数据库的数据源
        JbootApplication.setBootArg("jboot.datasource.url", "jdbc:mysql://172.16.1.201:3306/mighty_pay_basic?characterEncoding=utf8&useSSL=false");
        JbootApplication.setBootArg("jboot.datasource.user", "pay");
        JbootApplication.setBootArg("jboot.datasource.password", "qXxnmjG7LdN");

        String modelPackage = "com.linging.model";
        String baseModelPackage = modelPackage + ".base";

        String modelDir = PathKit.getWebRootPath() + "/src/main/java/" + modelPackage.replace(".", "/");
        String baseModelDir = PathKit.getWebRootPath() + "/src/main/java/" + baseModelPackage.replace(".", "/");

        System.out.println("start generate...");
        System.out.println("generate dir:" + modelDir);

        // 生成 Model
        new JbootBaseModelGenerator(baseModelPackage, baseModelDir).setGenerateRemarks(true).generate();
        new JbootModelGenerator(modelPackage, baseModelPackage, modelDir).generate();


        String servicePackage = "com.linging.service";
        String serviceImplPackage = "com.linging.service.impl";

        String serviceOutputDir = PathKit.getWebRootPath() + "/src/main/java/" + servicePackage.replace(".", "/");
        String serviceImplOutputDir = PathKit.getWebRootPath() + "/src/main/java/" + serviceImplPackage.replace(".", "/");

        // 生成 Service 接口 及其 实现类
        new JbootServiceInterfaceGenerator(servicePackage, serviceOutputDir, modelPackage).generate();
        new JbootServiceImplGenerator(servicePackage, serviceImplPackage, serviceImplOutputDir, modelPackage).setImplName("impl").generate();
    }
}
