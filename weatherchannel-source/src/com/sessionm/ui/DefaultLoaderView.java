// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sessionm.api.ext.Config;
import com.sessionm.core.Drawables;
import com.sessionm.core.h;
import java.util.Map;

// Referenced classes of package com.sessionm.ui:
//            LoaderView

public class DefaultLoaderView extends LoaderView
{

    protected static final int BUTTON_PADDING = 150;
    protected static final String CANNOT_CONNECT = "Cannot Connect";
    protected static final int DURATION = 100;
    protected static final String LOADING = "Loading";
    protected static final String OKAY = "Okay";
    protected static final String RETRY = "Retry";
    protected static final String TEMPORARILY_UNAVAILABLE = "Temporarily Unavailable";
    protected AnimationDrawable loadingAnimation;
    protected TextView loadingTextView;
    protected ImageView logoImageView;
    protected Button retryOkayButton;

    public DefaultLoaderView()
    {
    }

    private String getValueOrDefault(Map map, String s)
    {
label0:
        {
            if (map == null)
            {
                return s;
            }
            String s1 = (String)map.get(s);
            if (s1 != null)
            {
                map = s1;
                if (!s1.equals(""))
                {
                    break label0;
                }
            }
            map = s;
        }
        return map;
    }

    protected String getLabel(Config config, String s)
    {
        return getValueOrDefault(config.getTransitionButtonMap(), s);
    }

    protected String getMessage(Config config, String s)
    {
        return getValueOrDefault(config.getTransitionMessageMap(), s);
    }

    public void present(LoaderView.LoaderViewStatus loaderviewstatus)
    {
        Object obj;
        RelativeLayout relativelayout;
        LinearLayout linearlayout;
        Config config;
label0:
        {
            super.present(loaderviewstatus);
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            relativelayout = new RelativeLayout(activity);
            relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13, -1);
            linearlayout = new LinearLayout(activity);
            linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            linearlayout.setOrientation(1);
            config = Config.getInstance();
            String s = config.getTransitionViewTitle();
            if (s != null)
            {
                obj = s;
                if (!s.equals(""))
                {
                    break label0;
                }
            }
            obj = "REWARDS\nPowered by mPOINTS";
        }
        String as[] = ((String) (obj)).split("[\r\n]+");
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 1;
        TextView textview = new TextView(activity);
        if (as.length > 0)
        {
            obj = as[0];
        } else
        {
            obj = "";
        }
        textview.setText(((CharSequence) (obj)));
        textview.setLayoutParams(layoutparams);
        textview.setTextSize(40F);
        if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
        {
            textview.setTextSize(16F);
            textview.setTypeface(textview.getTypeface(), 1);
        }
        textview.setTextColor(Color.rgb(31, 31, 31));
        textview.setMaxLines(3);
        textview.setPadding(50, 0, 50, 0);
        linearlayout.addView(textview);
        if (as.length > 1)
        {
            obj = new TextView(activity);
            ((TextView) (obj)).setText(as[1]);
            ((TextView) (obj)).setTextColor(Color.rgb(41, 41, 41));
            ((TextView) (obj)).setTextSize(20F);
            if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
            {
                ((TextView) (obj)).setTextSize(14F);
            }
            ((TextView) (obj)).setMaxLines(3);
            ((TextView) (obj)).setPadding(50, 0, 50, 0);
            ((TextView) (obj)).setLayoutParams(layoutparams);
            linearlayout.addView(((View) (obj)));
        }
        logoImageView = new ImageView(activity);
        obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.gravity = 1;
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 50, 0, 0);
        logoImageView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        linearlayout.addView(logoImageView);
        if (config.getTransitionViewLoader() == null)
        {
            loadingAnimation = new AnimationDrawable();
            if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
            {
                loadingAnimation.addFrame(Drawables.bh.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bi.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bj.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bk.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bl.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bm.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bn.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bo.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bp.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bq.e(activity), 100);
                loadingAnimation.addFrame(Drawables.br.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bs.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bt.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bu.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bv.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bw.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bx.e(activity), 100);
                loadingAnimation.addFrame(Drawables.by.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bz.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bA.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bB.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bC.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bD.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bE.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bF.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bG.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bH.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bI.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bJ.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bK.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bL.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bM.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bN.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bO.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bP.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bQ.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bR.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bS.e(activity), 100);
            } else
            {
                loadingAnimation.addFrame(Drawables.aK.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aL.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aM.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aN.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aO.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aP.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aQ.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aR.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aS.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aT.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aU.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aV.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aW.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aX.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aY.e(activity), 100);
                loadingAnimation.addFrame(Drawables.aZ.e(activity), 100);
                loadingAnimation.addFrame(Drawables.ba.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bb.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bc.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bd.e(activity), 100);
                loadingAnimation.addFrame(Drawables.be.e(activity), 100);
                loadingAnimation.addFrame(Drawables.bf.e(activity), 100);
            }
            loadingAnimation.setOneShot(false);
        } else
        {
            loadingAnimation = config.getTransitionViewLoader();
        }
        obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.gravity = 1;
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 70, 0, 20);
        loadingTextView = new TextView(activity);
        loadingTextView.setTextSize(20F);
        if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
        {
            loadingTextView.setTextSize(16F);
        }
        loadingTextView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        loadingTextView.setTextColor(Color.rgb(41, 41, 41));
        loadingTextView.setMaxLines(2);
        linearlayout.addView(loadingTextView);
        obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.gravity = 1;
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 50, 0, 50);
        retryOkayButton = new Button(activity);
        retryOkayButton.setPadding(150, 20, 150, 20);
        retryOkayButton.setBackgroundColor(Color.rgb(189, 195, 199));
        retryOkayButton.setTextColor(Color.rgb(41, 41, 41));
        retryOkayButton.setTextSize(24F);
        retryOkayButton.setSingleLine(true);
        retryOkayButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        retryOkayButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DefaultLoaderView this$0;

            public void onClick(View view)
            {
                activity.runOnUiThread(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        if (loaderViewStatus == LoaderView.LoaderViewStatus.UNAVAILABLE)
                        {
                            containerLayout = null;
                            loaderViewStatus = null;
                            listener.onCancel();
                            return;
                        } else
                        {
                            setLoaderViewStatus(LoaderView.LoaderViewStatus.LOADING);
                            listener.onReloadStarted();
                            return;
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = DefaultLoaderView.this;
                super();
            }
        });
        linearlayout.addView(retryOkayButton);
        relativelayout.addView(linearlayout);
        containerLayout.addView(relativelayout);
        if (showCloseButton)
        {
            obj = h.d(activity);
            ((ImageButton) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final DefaultLoaderView this$0;

                public void onClick(View view)
                {
                    if (listener != null)
                    {
                        containerLayout = null;
                        loaderViewStatus = null;
                        listener.onCancel();
                    }
                }

            
            {
                this$0 = DefaultLoaderView.this;
                super();
            }
            });
            relativelayout.addView(((View) (obj)));
        }
        if (viewParent != null)
        {
            viewParent.addView(containerLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else
        {
            activity.addContentView(containerLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        setLoaderViewStatus(loaderviewstatus);
    }

    public void updateLoaderViewOnStatusChanged(LoaderView.LoaderViewStatus loaderviewstatus)
    {
        super.updateLoaderViewOnStatusChanged(loaderviewstatus);
        Config config = Config.getInstance();
        if (loaderviewstatus == LoaderView.LoaderViewStatus.FAILED)
        {
            android.graphics.drawable.BitmapDrawable bitmapdrawable = config.getTransitionViewErrorIcon();
            loaderviewstatus = bitmapdrawable;
            if (bitmapdrawable == null)
            {
                loaderviewstatus = Drawables.aJ.e(activity);
                if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
                {
                    loaderviewstatus = Drawables.bg.e(activity);
                }
            }
            if (android.os.Build.VERSION.SDK_INT > 16)
            {
                logoImageView.setBackground(loaderviewstatus);
            } else
            {
                logoImageView.setBackgroundDrawable(loaderviewstatus);
            }
            loadingAnimation.stop();
            loadingTextView.setText(getMessage(config, "Cannot Connect"));
            loadingTextView.setVisibility(0);
            retryOkayButton.setText(getLabel(config, "Retry"));
            retryOkayButton.setVisibility(0);
            return;
        }
        if (loaderviewstatus == LoaderView.LoaderViewStatus.UNAVAILABLE)
        {
            android.graphics.drawable.BitmapDrawable bitmapdrawable1 = config.getTransitionViewErrorIcon();
            loaderviewstatus = bitmapdrawable1;
            if (bitmapdrawable1 == null)
            {
                loaderviewstatus = Drawables.aJ.e(activity);
                if (com.sessionm.core.Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aE))
                {
                    loaderviewstatus = Drawables.bg.e(activity);
                }
            }
            if (android.os.Build.VERSION.SDK_INT > 16)
            {
                logoImageView.setBackground(loaderviewstatus);
            } else
            {
                logoImageView.setBackgroundDrawable(loaderviewstatus);
            }
            loadingAnimation.stop();
            loadingTextView.setText(getMessage(config, "Temporarily Unavailable"));
            loadingTextView.setVisibility(0);
            retryOkayButton.setText(getLabel(config, "Okay"));
            retryOkayButton.setVisibility(0);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            logoImageView.setBackground(loadingAnimation);
        } else
        {
            logoImageView.setBackgroundDrawable(loadingAnimation);
        }
        loadingAnimation.start();
        if (!h.m(14))
        {
            loadingAnimation.stop();
            logoImageView.post(new Runnable() {

                final DefaultLoaderView this$0;

                public void run()
                {
                    loadingAnimation.start();
                }

            
            {
                this$0 = DefaultLoaderView.this;
                super();
            }
            });
        }
        loadingTextView.setText(String.format("%s...", new Object[] {
            getMessage(config, "Loading")
        }));
        loadingTextView.setVisibility(0);
        retryOkayButton.setVisibility(4);
    }
}
