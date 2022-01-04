module com.udacity.security {
    requires java.desktop;
    requires java.prefs;
    requires com.google.gson;
    requires com.google.common;
    requires miglayout;
    requires com.udacity.image;
    requires java.sql;
    opens com.udacity.security.data to com.google.gson;
}