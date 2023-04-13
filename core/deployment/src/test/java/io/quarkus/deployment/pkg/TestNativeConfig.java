package io.quarkus.deployment.pkg;

import java.io.File;
import java.util.List;
import java.util.Optional;

import io.quarkus.runtime.util.ContainerRuntimeUtil;

public class TestNativeConfig implements NativeConfig {

    private final String builderImage;

    public TestNativeConfig(String builderImage) {
        this.builderImage = builderImage;
    }

    @Override
    public Optional<List<String>> additionalBuildArgs() {
        return Optional.empty();
    }

    @Override
    public boolean enableHttpUrlHandler() {
        return false;
    }

    @Override
    public boolean enableHttpsUrlHandler() {
        return false;
    }

    @Override
    public boolean enableAllSecurityServices() {
        return false;
    }

    @Override
    public boolean inlineBeforeAnalysis() {
        return false;
    }

    @Override
    public boolean enableJni() {
        return false;
    }

    @Override
    public boolean headless() {
        return false;
    }

    @Override
    public Optional<String> userLanguage() {
        return Optional.empty();
    }

    @Override
    public Optional<String> userCountry() {
        return Optional.empty();
    }

    @Override
    public String fileEncoding() {
        return null;
    }

    @Override
    public boolean addAllCharsets() {
        return false;
    }

    @Override
    public Optional<String> graalvmHome() {
        return Optional.empty();
    }

    @Override
    public File javaHome() {
        return null;
    }

    @Override
    public Optional<String> nativeImageXmx() {
        return Optional.empty();
    }

    @Override
    public boolean debugBuildProcess() {
        return false;
    }

    @Override
    public boolean publishDebugBuildProcessPort() {
        return false;
    }

    @Override
    public boolean cleanupServer() {
        return false;
    }

    @Override
    public boolean enableIsolates() {
        return false;
    }

    @Override
    public boolean enableFallbackImages() {
        return false;
    }

    @Override
    public boolean enableServer() {
        return false;
    }

    @Override
    public boolean autoServiceLoaderRegistration() {
        return false;
    }

    @Override
    public boolean dumpProxies() {
        return false;
    }

    @Override
    public Optional<Boolean> containerBuild() {
        return Optional.empty();
    }

    @Override
    public boolean remoteContainerBuild() {
        return false;
    }

    @Override
    public String builderImage() {
        return builderImage;
    }

    @Override
    public Optional<ContainerRuntimeUtil.ContainerRuntime> containerRuntime() {
        return Optional.empty();
    }

    @Override
    public Optional<List<String>> containerRuntimeOptions() {
        return Optional.empty();
    }

    @Override
    public boolean enableVmInspection() {
        return false;
    }

    @Override
    public Optional<List<MonitoringOption>> monitoring() {
        return Optional.empty();
    }

    @Override
    public boolean fullStackTraces() {
        return false;
    }

    @Override
    public boolean enableReports() {
        return false;
    }

    @Override
    public boolean reportExceptionStackTraces() {
        return false;
    }

    @Override
    public boolean reportErrorsAtRuntime() {
        return false;
    }

    @Override
    public boolean reuseExisting() {
        return false;
    }

    @Override
    public ResourcesConfig resources() {
        return null;
    }

    @Override
    public Debug debug() {
        return null;
    }

    @Override
    public boolean enableDashboardDump() {
        return false;
    }

    @Override
    public Compression compression() {
        return null;
    }
}
