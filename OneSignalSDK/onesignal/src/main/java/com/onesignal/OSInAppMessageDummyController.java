package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.onesignal.language.LanguageContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collection;
import java.util.Map;

class OSInAppMessageDummyController extends OSInAppMessageController {

    /**
     * In App Messaging is not supported for Android 4.3 and older devices
     * This is a dummy controller that will be used for Android 4.3 and older devices
     * All methods should be overridden and as empty as possible (few return exceptions)
     */
    OSInAppMessageDummyController(OneSignalDbHelper dbHelper, OSTaskController taskController, OSLogger logger,
                                  OSSharedPreferences sharedPreferences, LanguageContext languageContext) {
        super(dbHelper, taskController, logger, sharedPreferences, languageContext);
    }

    @Override
    public void initRedisplayData() {
    }

    @Override
    void initWithCachedInAppMessages() { }

    @Override
    void receivedInAppMessageJson(@NonNull JSONArray json) throws JSONException { }

    @Override
    void onMessageActionOccurredOnMessage(@NonNull OSInAppMessage message, @NonNull JSONObject actionJson) { }

    @Override
    void onMessageActionOccurredOnPreview(@NonNull OSInAppMessage message, @NonNull JSONObject actionJson) { }

    @Override
    boolean isInAppMessageShowing() { return false; }

    @Nullable
    @Override
    OSInAppMessage getCurrentDisplayedInAppMessage() { return null; }

    @Override
    public void messageWasDismissed(@NonNull OSInAppMessage message) { }

    @Override
    void displayPreviewMessage(@NonNull String previewUUID) { }

    @Override
    public void messageTriggerConditionChanged() { }

    @Override
    void addTriggers(Map<String, Object> newTriggers) { }

    @Override
    void removeTriggersForKeys(Collection<String> keys) { }

    @Override
    void setInAppMessagingEnabled(boolean enabled) { }

    @Override
    void cleanCachedInAppMessages() {
    }

    @Nullable
    @Override
    Object getTriggerValue(String key) { return null; }
}

