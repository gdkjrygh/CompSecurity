// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.sessionm.b.a;
import com.sessionm.core.Session;
import com.sessionm.core.h;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.ui:
//            ActivityController, LoaderView, SessionMViewContainer

public class SessionMActivity extends Activity
{

    public static final int FILE_CHOOSER_RESULT_CODE = 1;
    private static final String INTENT_PARAM_DATA = "com.sessionm.data";
    private static final String INTENT_PARAM_NOTIFY = "com.sessionm.notify";
    public static final String INTENT_PARAM_URL = "com.sessionm.url";
    private static final String TAG = "SessionM.Activity";
    private ActivityController controller;
    private boolean isInForeground;
    private LoaderView loaderView;
    private boolean notifyAboutPresentation;
    private ValueCallback uploadFile;

    public SessionMActivity()
    {
        notifyAboutPresentation = true;
    }

    public static String convertSessionMUrl(String s)
    {
        Uri uri = Uri.parse(s);
        if (s == null)
        {
            return null;
        }
        s = Session.D();
        if (uri.getHost().equals("ad"))
        {
            s = s.ae();
        } else
        {
            s = s.ah();
        }
        return String.format(Locale.US, "%s/%s", new Object[] {
            s, uri.getPath()
        });
    }

    public static boolean isSessionMUrl(String s)
    {
        boolean flag = false;
        String s1 = String.format(Locale.US, "sm%s", new Object[] {
            Session.D().E()
        });
        String s2 = String.format(Locale.US, "sessionm%s", new Object[] {
            Session.D().E()
        });
        if (s.startsWith(s1) || s.startsWith(s2))
        {
            flag = true;
        }
        return flag;
    }

    private void loadContent()
    {
        if (controller.getState() == ActivityController.State.UNPRESENTABLE && !h.k(this))
        {
            loaderView.setLoaderViewStatus(LoaderView.LoaderViewStatus.FAILED);
            return;
        } else
        {
            controller.prepare(new ActivityController.PrepareListener() {

                final SessionMActivity this$0;

                public void onFailure(Throwable throwable)
                {
                    runOnUiThread(new Runnable() {

                        final _cls2 this$1;

                        public void run()
                        {
                            getLoaderView().setLoaderViewStatus(LoaderView.LoaderViewStatus.FAILED);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }

                public void onPrepared()
                {
                    dismissLoadingIndicator();
                    controller.displayView();
                }

            
            {
                this$0 = SessionMActivity.this;
                super();
            }
            });
            return;
        }
    }

    public static boolean startSessionMActivity(Context context, String s, a a1, boolean flag)
    {
        Intent intent = new Intent(context, com/sessionm/ui/SessionMActivity);
        if (!h.a(context, intent))
        {
            if (Log.isLoggable("SessionM.Activity", 6))
            {
                Log.e("SessionM.Activity", "Unable to resolve SessionMActivity. Please check that your manifest is setup correctly.");
            }
            return false;
        }
        Bundle bundle = new Bundle();
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            bundle = ActivityOptions.makeCustomAnimation(context, 0x10a0002, 0x10a0003).toBundle();
        }
        bundle.putString("com.sessionm.url", s);
        if (a1 != null)
        {
            bundle.putString("com.sessionm.data", a1.aL().toString());
        }
        bundle.putBoolean("com.sessionm.notify", flag);
        intent.putExtras(bundle);
        context.startActivity(intent);
        return true;
    }

    protected void dismissLoadingIndicator()
    {
        loaderView.dismiss();
        loaderView = null;
    }

    public void finish()
    {
        finish(true);
    }

    void finish(boolean flag)
    {
        super.finish();
        if (flag && controller != null)
        {
            controller.dismiss();
        }
    }

    LoaderView getLoaderView()
    {
        return loaderView;
    }

    boolean isInForeground()
    {
        return isInForeground;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L2; else goto _L1
_L1:
        if (i == 1 && SessionMViewContainer.mFilePathCallback != null) goto _L4; else goto _L3
_L3:
        super.onActivityResult(i, j, intent);
_L5:
        return;
_L4:
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (intent == null)
        {
            if (SessionMViewContainer.mCameraPhotoPath == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            intent = new Uri[1];
            intent[0] = Uri.parse(SessionMViewContainer.mCameraPhotoPath);
        } else
        {
            String s = intent.getDataString();
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            intent = new Uri[1];
            intent[0] = Uri.parse(s);
        }
_L6:
        SessionMViewContainer.mFilePathCallback.onReceiveValue(intent);
        SessionMViewContainer.mFilePathCallback = null;
        return;
_L2:
        if (i == 1 && uploadFile != null)
        {
            if (intent == null || j != -1)
            {
                intent = null;
            } else
            {
                intent = intent.getData();
            }
            uploadFile.onReceiveValue(intent);
            uploadFile = null;
            return;
        }
          goto _L5
        intent = null;
          goto _L6
    }

    public void onBackPressed()
    {
        if (controller == null)
        {
            if (Log.isLoggable("SessionM.Activity", 6))
            {
                Log.e("SessionM.Activity", String.format("null controller encountered while handling back button press. This shouldn't happen.", new Object[0]));
            }
            return;
        }
        if (controller.isBrowserDisplayed())
        {
            WebView webview = controller.getBrowserView().getWebView();
            if (webview != null && webview.canGoBack())
            {
                webview.goBack();
                return;
            } else
            {
                controller.dismissBrowser();
                return;
            }
        } else
        {
            controller.dismiss();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        overridePendingTransition(0x10a0002, 0x10a0003);
        if (controller != null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        obj = getIntent();
        bundle = ((Intent) (obj)).getExtras();
        if (((Intent) (obj)).getAction() != "android.intent.action.VIEW") goto _L2; else goto _L1
_L1:
        bundle = ((Intent) (obj)).getData().toString();
        if (bundle == null || !isSessionMUrl(bundle)) goto _L4; else goto _L3
_L3:
        bundle = convertSessionMUrl(bundle);
        if (bundle != null) goto _L6; else goto _L5
_L5:
        finish();
_L9:
        return;
_L4:
        finish();
        return;
_L2:
        if (bundle != null)
        {
            String s = bundle.getString("com.sessionm.url");
            obj = bundle.getString("com.sessionm.data");
            if (notifyAboutPresentation)
            {
                notifyAboutPresentation = bundle.getBoolean("com.sessionm.notify");
            }
            bundle = s;
            if (s == null)
            {
                finish();
                return;
            }
        } else
        {
            finish();
            return;
        }
          goto _L7
_L6:
        obj = null;
_L7:
        controller = ActivityController.createActivityController(this, bundle, new Object[] {
            a.A(((String) (obj)))
        });
        Session.D().a(controller);
_L10:
        loaderView = LoaderView.getInstance();
        loaderView.init(this, new LoaderView.Listener() {

            final SessionMActivity this$0;

            public void onCancel()
            {
                finish();
            }

            public void onReloadStarted()
            {
                loadContent();
            }

            
            {
                this$0 = SessionMActivity.this;
                super();
            }
        });
        bundle = controller.getViewContainer().getViewGroup();
        RelativeLayout relativelayout = new RelativeLayout(this);
        relativelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        bundle.setVisibility(4);
        relativelayout.addView(bundle);
        setContentView(relativelayout);
        bundle = controller.getState();
        if (bundle == ActivityController.State.DISMISSED || bundle == ActivityController.State.LOADED_CONTENT)
        {
            loaderView.present(LoaderView.LoaderViewStatus.LOADING);
            loadContent();
        } else
        if (bundle == ActivityController.State.LOADED_WEBVIEW)
        {
            if (Session.D().getSessionState().isStarted())
            {
                controller.displayView();
            } else
            {
                loaderView.setLoaderViewStatus(LoaderView.LoaderViewStatus.UNAVAILABLE);
            }
        } else
        if (bundle != ActivityController.State.PRESENTED)
        {
            loaderView.present(LoaderView.LoaderViewStatus.LOADING);
        }
        if (!controller.isBrowserDisplayed()) goto _L9; else goto _L8
_L8:
        controller.presentBrowser(null);
        return;
        controller.resetWebView();
          goto _L10
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Session.D().updateAchievementsList();
        if (loaderView != null)
        {
            loaderView.dismiss();
        }
    }

    protected void onPause()
    {
        super.onPause();
        isInForeground = false;
        if (controller != null)
        {
            controller.notifyActivityPaused();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (notifyAboutPresentation)
        {
            Session.D().at();
            notifyAboutPresentation = false;
        }
        isInForeground = true;
        if (loaderView == null || !loaderView.isPresented() || !loaderView.isLoadFailed()) goto _L2; else goto _L1
_L1:
        if (!Session.D().getSessionState().isStarted()) goto _L4; else goto _L3
_L3:
        loaderView.setLoaderViewStatus(LoaderView.LoaderViewStatus.LOADING);
        loadContent();
_L6:
        return;
_L4:
        loaderView.setLoaderViewStatus(LoaderView.LoaderViewStatus.UNAVAILABLE);
        return;
_L2:
        if (controller != null)
        {
            controller.notifyActivityResumed();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onStart()
    {
        super.onStart();
    }

    void pushActivityController(ActivityController activitycontroller)
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format(Locale.US, "pushing activity controller: %s", new Object[] {
                activitycontroller
            }));
        }
        Session.D().b(controller);
        controller = activitycontroller;
        RelativeLayout relativelayout = new RelativeLayout(this);
        relativelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        relativelayout.addView(activitycontroller.getViewContainer().getViewGroup());
        setContentView(relativelayout);
    }

    void setUploadFile(ValueCallback valuecallback)
    {
        uploadFile = valuecallback;
    }


}
