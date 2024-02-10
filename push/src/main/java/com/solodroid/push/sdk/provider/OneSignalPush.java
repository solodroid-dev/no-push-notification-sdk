package com.solodroid.push.sdk.provider;

import android.content.Context;

import com.solodroid.push.sdk.utils.OnNotificationClickListener;

public class OneSignalPush {

    public static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 22;

    public static class Builder {

        private static final String TAG = "OneSignalPush";
        Context context;
        private String oneSignalAppId = "";
        private String notificationId = "";
        private String notificationTitle = "";
        private String notificationMessage = "";
        private String notificationBigImage = "";
        private String notificationLaunchUrl = "";
        private String uniqueId = "";
        private String postId = "";
        private int postID;
        private String link = "";

        public Builder(Context context) {
            this.context = context;
        }

        public Builder build(OnNotificationClickListener onNotificationClickListener) {
            initNotification(onNotificationClickListener);
            return this;
        }

        public Builder create(OnNotificationClickListener onNotificationClickListener) {
            buildNotification(onNotificationClickListener);
            return this;
        }

        public Builder setOneSignalAppId(String oneSignalAppId) {
            this.oneSignalAppId = oneSignalAppId;
            return this;
        }

        public void initNotification(OnNotificationClickListener onNotificationClickListener) {

        }

        public void buildNotification(OnNotificationClickListener onNotificationClickListener) {

        }

        public void requestNotificationPermission() {

        }

    }

    public static class Data {
        public static String id = "";
        public static String title = "";
        public static String message = "";
        public static String bigImage = "";
        public static String launchUrl = "";
    }

    public static class AdditionalData {
        public static String uniqueId = "";
        public static String postId = "";
        public static int postID;
        public static String link = "";
    }

    public static String EXTRA_ID = "id";
    public static String EXTRA_TITLE = "title";
    public static String EXTRA_MESSAGE = "message";
    public static String EXTRA_IMAGE = "image";
    public static String EXTRA_LAUNCH_URL = "launch_url";
    public static String EXTRA_UNIQUE_ID = "unique_id";
    public static String EXTRA_POST_ID = "post_id";
    public static String EXTRA_LINK = "link";

}
