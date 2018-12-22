package cl.json.social;

import android.content.ActivityNotFoundException;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

public class SnapchatShare extends SingleShareIntent {

    private static final String PACKAGE = "com.snapchat.android";
    private static final String CLASS = "com.snapchat.android.LandingPageActivity";
    private static final String PLAY_STORE_LINK = "market://details?id=com.snapchat.android";

    public SnapchatShare(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public void open(ReadableMap options) throws ActivityNotFoundException {
        super.open(options);
        //  extra params here
        this.openIntentChooser();
    }

    @Override
    protected String getPackage() {
        return PACKAGE;
    }

    @Override
    protected String getComponentClass() { return CLASS; }

    @Override
    protected String getDefaultWebLink() {
        return null;
    }

    @Override
    protected String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }
}
