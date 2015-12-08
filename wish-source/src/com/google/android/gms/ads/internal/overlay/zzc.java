// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzfm;
import com.google.android.gms.internal.zzfn;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzj, AdOverlayInfoParcel, zzf, zza, 
//            zzg, zzh

public class com.google.android.gms.ads.internal.overlay.zzc extends com.google.android.gms.internal.zzdj.zza
    implements zzj
{
    private static final class zza extends Exception
    {

        public zza(String s)
        {
            super(s);
        }
    }

    static final class zzb extends RelativeLayout
    {

        zzfn zzmF;

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            zzmF.zzc(motionevent);
            return false;
        }

        public zzb(Context context, String s)
        {
            super(context);
            zzmF = new zzfn(context, s);
        }
    }

    public static class zzc
    {

        public final int index;
        public final Context zzmH;
        public final android.view.ViewGroup.LayoutParams zzwu;
        public final ViewGroup zzwv;

        public zzc(zzgd zzgd1)
            throws zza
        {
            zzwu = zzgd1.getLayoutParams();
            android.view.ViewParent viewparent = zzgd1.getParent();
            zzmH = zzgd1.zzfq();
            if (viewparent != null && (viewparent instanceof ViewGroup))
            {
                zzwv = (ViewGroup)viewparent;
                index = zzwv.indexOfChild(zzgd1.getWebView());
                zzwv.removeView(zzgd1.getWebView());
                zzgd1.zzB(true);
                return;
            } else
            {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
        }
    }


    static final int zzwe = Color.argb(0, 0, 0, 0);
    zzgd zznp;
    private final Activity zzpf;
    RelativeLayout zzvB;
    AdOverlayInfoParcel zzwf;
    zzg zzwg;
    zzc zzwh;
    com.google.android.gms.ads.internal.overlay.zzh zzwi;
    boolean zzwj;
    FrameLayout zzwk;
    android.webkit.WebChromeClient.CustomViewCallback zzwl;
    boolean zzwm;
    boolean zzwn;
    boolean zzwo;
    int zzwp;
    private boolean zzwq;
    private boolean zzwr;
    private boolean zzws;

    public com.google.android.gms.ads.internal.overlay.zzc(Activity activity)
    {
        zzwj = false;
        zzwm = false;
        zzwn = false;
        zzwo = false;
        zzwp = 0;
        zzwr = false;
        zzws = true;
        zzpf = activity;
    }

    public void close()
    {
        zzwp = 2;
        zzpf.finish();
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        zzwm = flag;
        zzwf = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzb(zzpf.getIntent());
        if (zzwf == null)
        {
            throw new zza("Could not get info for ad overlay.");
        }
          goto _L1
_L10:
        return;
_L1:
        if (zzpf.getIntent() != null)
        {
            zzws = zzpf.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
        }
        if (zzwf.zzwI == null) goto _L3; else goto _L2
_L2:
        zzwn = zzwf.zzwI.zznf;
_L9:
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (zzwf.zzwy != null && zzws)
        {
            zzwf.zzwy.zzak();
        }
        if (zzwf.zzwF != 1 && zzwf.zzwx != null)
        {
            zzwf.zzwx.onAdClicked();
        }
        zzvB = new zzb(zzpf, zzwf.zzwH);
        zzwf.zzwF;
        JVM INSTR tableswitch 1 4: default 362
    //                   1 266
    //                   2 272
    //                   3 296
    //                   4 302;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new zza("Could not determine ad overlay type.");
_L3:
        zzwn = false;
          goto _L9
_L5:
        try
        {
            zzu(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan(bundle.getMessage());
            zzwp = 3;
            zzpf.finish();
        }
          goto _L10
_L6:
        zzwh = new zzc(zzwf.zzwz);
        zzu(false);
        return;
_L7:
        zzu(true);
        return;
_L8:
        if (zzwm)
        {
            zzwp = 3;
            zzpf.finish();
            return;
        }
        if (zzh.zzaN().zza(zzpf, zzwf.zzww, zzwf.zzwE)) goto _L10; else goto _L11
_L11:
        zzwp = 3;
        zzpf.finish();
        return;
    }

    public void onDestroy()
    {
        if (zzwg != null)
        {
            zzwg.destroy();
        }
        if (zznp != null)
        {
            zzvB.removeView(zznp.getWebView());
        }
        zzdw();
    }

    public void onPause()
    {
        if (zzwg != null)
        {
            zzwg.pause();
        }
        zzdt();
        if (zznp != null && (!zzpf.isFinishing() || zzwh == null))
        {
            zzh.zzaS().zza(zznp.getWebView());
        }
        zzdw();
    }

    public void onRestart()
    {
    }

    public void onResume()
    {
        if (zzwf != null && zzwf.zzwF == 4)
        {
            if (zzwm)
            {
                zzwp = 3;
                zzpf.finish();
            } else
            {
                zzwm = true;
            }
        }
        if (zznp != null && !zznp.isDestroyed())
        {
            zzh.zzaS().zzb(zznp.getWebView());
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("The webview does not exit. Ignoring action.");
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", zzwm);
    }

    public void onStart()
    {
    }

    public void onStop()
    {
        zzdw();
    }

    public void setRequestedOrientation(int i)
    {
        zzpf.setRequestedOrientation(i);
    }

    public void zza(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        zzwk = new FrameLayout(zzpf);
        zzwk.setBackgroundColor(0xff000000);
        zzwk.addView(view, -1, -1);
        zzpf.setContentView(zzwk);
        zzab();
        zzwl = customviewcallback;
        zzwj = true;
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (zzwi != null)
        {
            zzwi.zza(flag, flag1);
        }
    }

    public void zzab()
    {
        zzwq = true;
    }

    public void zzd(int i, int j, int k, int l)
    {
        if (zzwg != null)
        {
            zzwg.zzf(i, j, k, l);
        }
    }

    public zzg zzds()
    {
        return zzwg;
    }

    public void zzdt()
    {
        if (zzwf != null && zzwj)
        {
            setRequestedOrientation(zzwf.orientation);
        }
        if (zzwk != null)
        {
            zzpf.setContentView(zzvB);
            zzab();
            zzwk.removeAllViews();
            zzwk = null;
        }
        if (zzwl != null)
        {
            zzwl.onCustomViewHidden();
            zzwl = null;
        }
        zzwj = false;
    }

    public void zzdu()
    {
        zzwp = 1;
        zzpf.finish();
    }

    public void zzdv()
    {
        zzvB.removeView(zzwi);
        zzt(true);
    }

    protected void zzdw()
    {
        if (zzpf.isFinishing() && !zzwr)
        {
            zzwr = true;
            if (zzpf.isFinishing())
            {
                if (zznp != null)
                {
                    zzp(zzwp);
                    zzvB.removeView(zznp.getWebView());
                    if (zzwh != null)
                    {
                        zznp.setContext(zzwh.zzmH);
                        zznp.zzB(false);
                        zzwh.zzwv.addView(zznp.getWebView(), zzwh.index, zzwh.zzwu);
                        zzwh = null;
                    }
                }
                if (zzwf != null && zzwf.zzwy != null)
                {
                    zzwf.zzwy.zzaj();
                    return;
                }
            }
        }
    }

    public void zzdx()
    {
        if (zzwo)
        {
            zzwo = false;
            zzdy();
        }
    }

    protected void zzdy()
    {
        zznp.zzdy();
    }

    public void zze(int i, int j, int k, int l)
    {
        if (zzwg == null)
        {
            zzwg = new zzg(zzpf, zznp);
            zzvB.addView(zzwg, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            zzwg.zzf(i, j, k, l);
            zznp.zzft().zzD(false);
        }
    }

    protected void zzp(int i)
    {
        zznp.zzp(i);
    }

    public void zzt(boolean flag)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        byte byte0;
        if (flag)
        {
            byte0 = 50;
        } else
        {
            byte0 = 32;
        }
        zzwi = new com.google.android.gms.ads.internal.overlay.zzh(zzpf, byte0, this);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(10);
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 9;
        }
        layoutparams.addRule(byte0);
        zzwi.zza(flag, zzwf.zzwC);
        zzvB.addView(zzwi, layoutparams);
    }

    protected void zzu(boolean flag)
        throws zza
    {
        if (!zzwq)
        {
            zzpf.requestWindowFeature(1);
        }
        Object obj = zzpf.getWindow();
        if (obj == null)
        {
            throw new zza("Invalid activity, no window available.");
        }
        if (!zzwn || zzwf.zzwI != null && zzwf.zzwI.zznt)
        {
            ((Window) (obj)).setFlags(1024, 1024);
        }
        boolean flag3 = zzwf.zzwz.zzft().zzbg();
        zzwo = false;
        if (flag3)
        {
            if (zzwf.orientation == zzh.zzaS().zzfe())
            {
                boolean flag1;
                if (zzpf.getResources().getConfiguration().orientation == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                zzwo = flag1;
            } else
            if (zzwf.orientation == zzh.zzaS().zzff())
            {
                boolean flag2;
                if (zzpf.getResources().getConfiguration().orientation == 2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                zzwo = flag2;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaj((new StringBuilder()).append("Delay onShow to next orientation change: ").append(zzwo).toString());
        setRequestedOrientation(zzwf.orientation);
        if (zzh.zzaS().zza(((Window) (obj))))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Hardware acceleration on the AdActivity window enabled.");
        }
        if (!zzwn)
        {
            zzvB.setBackgroundColor(0xff000000);
        } else
        {
            zzvB.setBackgroundColor(zzwe);
        }
        zzpf.setContentView(zzvB);
        zzab();
        if (flag)
        {
            zznp = zzh.zzaR().zza(zzpf, zzwf.zzwz.zzah(), true, flag3, null, zzwf.zzmJ);
            zznp.zzft().zzb(null, null, zzwf.zzwA, zzwf.zzwE, true, zzwf.zzwG, null, zzwf.zzwz.zzft().zzfA(), null);
            zznp.zzft().zza(new com.google.android.gms.internal.zzge.zza() {

                final com.google.android.gms.ads.internal.overlay.zzc zzwt;

                public void zza(zzgd zzgd1, boolean flag4)
                {
                    zzgd1.zzft().zzfG();
                    zzgd1.zzdy();
                }

            
            {
                zzwt = com.google.android.gms.ads.internal.overlay.zzc.this;
                super();
            }
            });
            if (zzwf.zzwa != null)
            {
                zznp.loadUrl(zzwf.zzwa);
            } else
            if (zzwf.zzwD != null)
            {
                zznp.loadDataWithBaseURL(zzwf.zzwB, zzwf.zzwD, "text/html", "UTF-8", null);
            } else
            {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (zzwf.zzwz != null)
            {
                zzwf.zzwz.zzb(this);
            }
        } else
        {
            zznp = zzwf.zzwz;
            zznp.setContext(zzpf);
        }
        zznp.zza(this);
        obj = zznp.getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            ((ViewGroup)obj).removeView(zznp.getWebView());
        }
        if (zzwn)
        {
            zznp.setBackgroundColor(zzwe);
        }
        zzvB.addView(zznp.getWebView(), -1, -1);
        if (!flag && !zzwo)
        {
            zzdy();
        }
        zzt(flag3);
        if (zznp.zzfu())
        {
            zza(flag3, true);
        }
    }

}
