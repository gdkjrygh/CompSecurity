// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.login.LoginManager;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.urbanairship.push.PushManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity, JavaScriptListener, PopupActivity

class val.secondButton
    implements android.content.nClickListener
{

    final MessageToJS this$1;
    private final String val$commandId;
    private final String val$secondButton;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(val$commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"").append(val$secondButton).append("\"}}").toString();
        sendMessageToJS(dialoginterface);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$commandId = s;
        val$secondButton = String.this;
        super();
    }

    // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$1

/* anonymous class */
    class MainActivity._cls1
        implements JavaScriptListener
    {

        final MainActivity this$0;

        public void addAssetToList(String s)
        {
            if (!assets.contains(s))
            {
                assets.add(s);
            }
        }

        public void closeApp()
        {
            finish();
        }

        public void facebookGraphRequest(final String commandId, String s, HttpMethod httpmethod, String s1)
        {
            Bundle bundle = new Bundle();
            bundle.putString("fields", s1);
            (new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder("/")).append(s).toString(), bundle, httpmethod, new MainActivity._cls1._cls1())).executeAsync();
        }

        public void facebookLogin(String s, List list, boolean flag)
        {
            MainActivity.access$0(list);
            int i = Integer.parseInt(s);
            MainActivity.access$1(MainActivity.this, i);
            MainActivity.access$2(MainActivity.this, "FacebookLogin");
            if (flag)
            {
                MainActivity.access$3(MainActivity.this, i, list);
                return;
            }
            if (AccessToken.getCurrentAccessToken() != null)
            {
                s = (new StringBuilder("{\"commandId\":\"")).append(MainActivity.access$4(MainActivity.this)).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(MainActivity.access$5(MainActivity.this)).append("\",\"payload\":{\"token\":\"").append(AccessToken.getCurrentAccessToken().getToken()).append("\"}}").toString();
            } else
            {
                s = (new StringBuilder("{\"commandId\":\"")).append(MainActivity.access$4(MainActivity.this)).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(MainActivity.access$5(MainActivity.this)).append("\"}").toString();
            }
            sendMessageToJS(s);
        }

        public void facebookLogout(String s)
        {
            MainActivity.access$6(MainActivity.this, s);
        }

        public void facebookPermissionRequest(String s, List list)
        {
            MainActivity.access$1(MainActivity.this, Integer.parseInt(s));
            MainActivity.access$2(MainActivity.this, "FacebookRequestReadPermissions");
            if (AccessToken.getCurrentAccessToken() != null)
            {
                s = AccessToken.getCurrentAccessToken().getPermissions();
                if (!MainActivity.access$7(MainActivity.this, list, s))
                {
                    LoginManager.getInstance().logInWithReadPermissions(getParent(), list);
                }
            }
        }

        public void facebookShare(String s, String s1, String s2, String s3, String s4)
        {
            s = (new StringBuilder("https://www.facebook.com/dialog/feed?app_id=")).append(getString(0x7f08004b)).append("&link=").append(s3).append("&redirect_uri=").append("http://www.nbc.com/the-voice/?votenow=null").append("&therecanbeonly=one").append("&name=").append(s1).append("&description=").append(s2).append("&picture=").append(s4).toString();
            handleFacebookShare(s);
        }

        public void mixpanelIncrementPeopleProperties(JSONObject jsonobject)
        {
            HashMap hashmap = new HashMap();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.getPeople().increment(hashmap);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    hashmap.put(s, Integer.valueOf(jsonobject.getInt(s)));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelRegisterSuperProperties(JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.registerSuperProperties(jsonobject1);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    jsonobject1.put(s, jsonobject.getString(s));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelSetPeopleProperties(JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.getPeople().set(jsonobject1);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    jsonobject1.put(s, jsonobject.getString(s));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelTrackEvent(String s, JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.track(s, jsonobject1);
                    return;
                }
                try
                {
                    String s1 = jsonobject.names().getString(i);
                    jsonobject1.put(s1, jsonobject.getString(s1));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void openDialog(String s, String s1, final String commandId, final String firstButton, String s2)
        {
            String s3 = s;
            if (s == null)
            {
                s3 = getString(0x7f080049);
            }
            if (s1.startsWith("Are you sure you want to close"))
            {
                showQuitDialog();
                return;
            } else
            {
                s = LayoutInflater.from(MainActivity.access$8(MainActivity.this)).inflate(0x7f03000e, null);
                (new android.app.AlertDialog.Builder(MainActivity.access$8(MainActivity.this), 5)).setTitle(s3).setMessage(s1).setView(s).setPositiveButton(firstButton, new MainActivity._cls1._cls2()).setNegativeButton(s2, s2. new MainActivity._cls1._cls3()).setOnCancelListener(new MainActivity._cls1._cls4()).show();
                return;
            }
        }

        public void openUrl(String s, boolean flag, String s1)
        {
            if (flag)
            {
                if (!MainActivity.popupOpened)
                {
                    Intent intent = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("nav", true);
                    bundle.putString("key", s);
                    if (s1 != null)
                    {
                        bundle.putString("phase", s1);
                    }
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                return;
            } else
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(s);
                return;
            }
        }

        public void pauseAudio(String s)
        {
            if (MainActivity.access$9(MainActivity.this).isPlaying())
            {
                MainActivity.access$9(MainActivity.this).pause();
            }
        }

        public void playAudio(String s, String s1)
        {
            if (MainActivity.access$9(MainActivity.this) == null)
            {
                Log.i("Badger", "Initializing mediaPlayer");
                MainActivity.access$10(MainActivity.this, new MediaPlayer());
                MainActivity.access$9(MainActivity.this).setOnCompletionListener(new MainActivity._cls1._cls5());
            }
            s = new File((new StringBuilder()).append(getCacheDir()).append("/").append(s).toString());
            if (!s.exists())
            {
                Log.e("Badger", "No such file");
                s = (new StringBuilder("{\"commandId\":\"")).append(s1).append("\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\",\"error\":{\"code\":\"File not found.\"}").toString();
                sendMessageToJS(s);
                return;
            }
            try
            {
                if (MainActivity.access$9(MainActivity.this).isPlaying())
                {
                    MainActivity.access$9(MainActivity.this).stop();
                    MainActivity.access$9(MainActivity.this).reset();
                    MainActivity.access$11(MainActivity.this).close();
                }
                MainActivity.access$12(MainActivity.this, new FileInputStream(s));
                MainActivity.access$9(MainActivity.this).setDataSource(MainActivity.access$11(MainActivity.this).getFD());
                MainActivity.access$9(MainActivity.this).prepare();
                MainActivity.access$9(MainActivity.this).start();
                s = (new StringBuilder("{\"commandId\":\"")).append(s1).append("\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\"}").toString();
                sendMessageToJS(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }

        public void pushSetting(boolean flag, String s)
        {
            android.content.SharedPreferences.Editor editor = MainActivity.access$13(MainActivity.this).edit();
            if (flag)
            {
                PushManager.enablePush();
                editor.putBoolean("push", flag);
                sendMessageToJS(s);
            } else
            {
                PushManager.disablePush();
                editor.putBoolean("push", flag);
                sendMessageToJS(s);
            }
            editor.commit();
        }

        public void reloadWebView()
        {
            MainActivity.access$14(MainActivity.this).reload();
        }

        public void resumeAudio(String s)
        {
            try
            {
                MainActivity.access$9(MainActivity.this).start();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }

        public void saveSharedPreference(String s, String s1)
        {
            android.content.SharedPreferences.Editor editor = MainActivity.access$13(MainActivity.this).edit();
            editor.putString(s, s1);
            editor.commit();
        }

        public void sendNativeMessage(String s)
        {
            sendMessageToJS(s);
        }

        public void stopAudio(String s)
        {
            if (!MainActivity.access$9(MainActivity.this).isPlaying())
            {
                break MISSING_BLOCK_LABEL_43;
            }
            MainActivity.access$9(MainActivity.this).stop();
            MainActivity.access$9(MainActivity.this).reset();
            MainActivity.access$11(MainActivity.this).close();
            return;
            s;
            s.printStackTrace();
            return;
        }


            
            {
                this$0 = MainActivity.this;
                super();
            }

        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$1$1

/* anonymous class */
        class MainActivity._cls1._cls1
            implements com.facebook.GraphRequest.Callback
        {

            final MainActivity._cls1 this$1;
            private final String val$commandId;

            public void onCompleted(GraphResponse graphresponse)
            {
                String s = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"FacebookGraphRequest\",\"payload\":").append(graphresponse.getRawResponse()).append("}").toString();
                sendMessageToJS(s);
                Log.i("WebLog", (new StringBuilder("GRAPHRESPONSE: ")).append(graphresponse.getRawResponse()).toString());
            }

                    
                    {
                        this$1 = MainActivity._cls1.this;
                        commandId = s;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$1$2

/* anonymous class */
        class MainActivity._cls1._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final MainActivity._cls1 this$1;
            private final String val$commandId;
            private final String val$firstButton;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"").append(firstButton).append("\"}}").toString();
                sendMessageToJS(dialoginterface);
            }

                    
                    {
                        this$1 = MainActivity._cls1.this;
                        commandId = s;
                        firstButton = s1;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$1$4

/* anonymous class */
        class MainActivity._cls1._cls4
            implements android.content.DialogInterface.OnCancelListener
        {

            final MainActivity._cls1 this$1;
            private final String val$commandId;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"Nothing\"}}").toString();
                sendMessageToJS(dialoginterface);
            }

                    
                    {
                        this$1 = MainActivity._cls1.this;
                        commandId = s;
                        super();
                    }
        }


        // Unreferenced inner class com/nbcuni/nbc/thevoice/MainActivity$1$5

/* anonymous class */
        class MainActivity._cls1._cls5
            implements android.media.MediaPlayer.OnCompletionListener
        {

            final MainActivity._cls1 this$1;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                try
                {
                    MainActivity.access$9(this$0).reset();
                    MainActivity.access$11(this$0).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (MediaPlayer mediaplayer)
                {
                    mediaplayer.printStackTrace();
                }
            }

                    
                    {
                        this$1 = MainActivity._cls1.this;
                        super();
                    }
        }

    }

}
