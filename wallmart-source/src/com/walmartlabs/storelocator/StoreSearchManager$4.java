// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreSearchManager

class this._cls0
    implements com.walmart.android.search.SearchRequestedListener
{

    final StoreSearchManager this$0;

    private boolean startVoiceRecognitionActivity()
    {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("calling_package", getClass().getPackage().getName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 5);
        try
        {
            StoreSearchManager.access$100(StoreSearchManager.this).startActivityForResult(intent, 1000);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            enableVoiceSearchButton(false);
            return false;
        }
        return true;
    }

    public void onVoiceSearchRequested()
    {
        startVoiceRecognitionActivity();
    }

    archRequestedListener()
    {
        this$0 = StoreSearchManager.this;
        super();
    }
}
