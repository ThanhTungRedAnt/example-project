package com.example.config;

/**
 * Application constants.
 */
public final class Constants {

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_LANGUAGE = "vi";
    public static final String ANONYMOUS_USER = "anonymoususer";
    public static final String TYPE_ATTACHMENT_FILE_BLOG = "blog";
    public static final String TYPE_ATTACHMENT_FILE_BANNER = "banner";
    public static final String TYPE_ATTACHMENT_FILE_FEEDBACK = "feedback";

    private Constants() {
    }
}
