package com.linging.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Interceptors;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;
import io.jboot.aop.jfinal.JfinalHandlers;
import io.jboot.aop.jfinal.JfinalPlugins;
import io.jboot.app.config.JbootConfigManager;
import io.jboot.core.listener.JbootAppListener;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
public class MyApplicationListener implements JbootAppListener {

    @Override
    public void onInit() {
        JbootConfigManager.me().setDecryptor(new MyConfigDecriptor());
    }

    @Override
    public void onConstantConfig(Constants constants) {

    }

    @Override
    public void onRouteConfig(Routes routes) {

    }

    @Override
    public void onEngineConfig(Engine engine) {

    }

    @Override
    public void onPluginConfig(JfinalPlugins plugins) {

    }

    @Override
    public void onInterceptorConfig(Interceptors interceptors) {

    }

    @Override
    public void onHandlerConfig(JfinalHandlers handlers) {

    }

    @Override
    public void onStartBefore() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStartFinish() {

    }

    @Override
    public void onStop() {

    }
}
