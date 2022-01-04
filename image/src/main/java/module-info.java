module com.udacity.image {
    exports com.udacity.image to com.udacity.security;
    requires org.slf4j;
    requires software.amazon.awssdk.services.rekognition;
    requires software.amazon.awssdk.auth;
    requires java.desktop;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
//    exports com.udacity.image.service;
}