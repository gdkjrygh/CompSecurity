// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgd, zzfl, zzdh

public class zzdb extends zzdg
{

    static final Set zzvp = new HashSet(Arrays.asList(new String[] {
        "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
    }));
    private int zzma;
    private int zzmb;
    private final zzgd zznp;
    private final Object zzoe = new Object();
    private AdSizeParcel zzuO;
    private PopupWindow zzvA;
    private RelativeLayout zzvB;
    private ViewGroup zzvC;
    private String zzvq;
    private boolean zzvr;
    private int zzvs;
    private int zzvt;
    private int zzvu;
    private int zzvv;
    private final Activity zzvw;
    private ImageView zzvx;
    private LinearLayout zzvy;
    private zzdh zzvz;

    public zzdb(zzgd zzgd1, zzdh zzdh1)
    {
        super(zzgd1, "resize");
        zzvq = "top-right";
        zzvr = true;
        zzvs = 0;
        zzvt = 0;
        zzmb = -1;
        zzvu = 0;
        zzvv = 0;
        zzma = -1;
        zznp = zzgd1;
        zzvw = zzgd1.zzfp();
        zzvz = zzdh1;
    }

    private int[] zzdf()
    {
        if (!zzdh())
        {
            return null;
        }
        if (zzvr)
        {
            return (new int[] {
                zzvs + zzvu, zzvt + zzvv
            });
        }
        int ai[] = zzh.zzaQ().zzh(zzvw);
        int ai1[] = zzh.zzaQ().zzj(zzvw);
        int l = ai[0];
        int j = zzvs + zzvu;
        int k = zzvt + zzvv;
        int i;
        if (j < 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (zzma + j > l)
            {
                i = l - zzma;
            }
        }
        if (k < ai1[0])
        {
            j = ai1[0];
        } else
        {
            j = k;
            if (zzmb + k > ai1[1])
            {
                j = ai1[1] - zzmb;
            }
        }
        return (new int[] {
            i, j
        });
    }

    private void zzf(Map map)
    {
        if (!TextUtils.isEmpty((CharSequence)map.get("width")))
        {
            zzma = zzh.zzaQ().zzae((String)map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("height")))
        {
            zzmb = zzh.zzaQ().zzae((String)map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetX")))
        {
            zzvu = zzh.zzaQ().zzae((String)map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("offsetY")))
        {
            zzvv = zzh.zzaQ().zzae((String)map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence)map.get("allowOffscreen")))
        {
            zzvr = Boolean.parseBoolean((String)map.get("allowOffscreen"));
        }
        map = (String)map.get("customClosePosition");
        if (!TextUtils.isEmpty(map))
        {
            zzvq = map;
        }
    }

    public void zza(int i, int j, boolean flag)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzvs = i;
        zzvt = j;
        if (zzvA == null || !flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        int ai[] = zzdf();
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzvA.update(zzj.zzbJ().zzb(zzvw, ai[0]), zzj.zzbJ().zzb(zzvw, ai[1]), zzvA.getWidth(), zzvA.getHeight());
        zzc(ai[0], ai[1]);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzn(true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void zzb(int i, int j)
    {
        if (zzvz != null)
        {
            zzvz.zza(i, j, zzma, zzmb);
        }
    }

    void zzc(int i, int j)
    {
        zzb(i, j - zzh.zzaQ().zzj(zzvw)[0], zzma, zzmb);
    }

    public void zzd(int i, int j)
    {
        zzvs = i;
        zzvt = j;
    }

    boolean zzde()
    {
        return zzma > -1 && zzmb > -1;
    }

    public boolean zzdg()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzvA != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    boolean zzdh()
    {
        int ai[];
        int i;
        int k;
        int ai1[] = zzh.zzaQ().zzh(zzvw);
        ai = zzh.zzaQ().zzj(zzvw);
        k = ai1[0];
        i = ai1[1];
        if (zzma >= 50 && zzma <= k) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.util.client.zzb.zzan("Width is too small or too large.");
_L18:
        return false;
_L2:
        String s;
        if (zzmb < 50 || zzmb > i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Height is too small or too large.");
            return false;
        }
        if (zzmb == i && zzma == k)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("Cannot resize to a full-screen ad.");
            return false;
        }
        if (!zzvr)
        {
            break; /* Loop/switch isn't completed */
        }
        s = zzvq;
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 180
    //                   -1364013995: 311
    //                   -1012429441: 283
    //                   -655373719: 325
    //                   1163912186: 353
    //                   1288627767: 339
    //                   1755462605: 297;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i;
        JVM INSTR tableswitch 0 5: default 220
    //                   0 367
    //                   1 393
    //                   2 427
    //                   3 471
    //                   4 505
    //                   5 547;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L10:
        int j;
        j = (zzvs + zzvu + zzma) - 50;
        i = zzvt + zzvv;
_L19:
        if (j < 0 || j + 50 > k || i < ai[0] || i + 50 > ai[1]) goto _L18; else goto _L17
_L17:
        return true;
_L5:
        if (s.equals("top-left"))
        {
            i = 0;
        }
          goto _L3
_L9:
        if (s.equals("top-center"))
        {
            i = 1;
        }
          goto _L3
_L4:
        if (s.equals("center"))
        {
            i = 2;
        }
          goto _L3
_L6:
        if (s.equals("bottom-left"))
        {
            i = 3;
        }
          goto _L3
_L8:
        if (s.equals("bottom-center"))
        {
            i = 4;
        }
          goto _L3
_L7:
        if (s.equals("bottom-right"))
        {
            i = 5;
        }
          goto _L3
_L11:
        i = zzvs;
        j = zzvu + i;
        i = zzvt + zzvv;
          goto _L19
_L12:
        j = (zzvs + zzvu + zzma / 2) - 25;
        i = zzvt + zzvv;
          goto _L19
_L13:
        j = (zzvs + zzvu + zzma / 2) - 25;
        i = (zzvt + zzvv + zzmb / 2) - 25;
          goto _L19
_L14:
        i = zzvs;
        j = zzvu + i;
        i = (zzvt + zzvv + zzmb) - 50;
          goto _L19
_L15:
        j = (zzvs + zzvu + zzma / 2) - 25;
        i = (zzvt + zzvv + zzmb) - 50;
          goto _L19
_L16:
        j = (zzvs + zzvu + zzma) - 50;
        i = (zzvt + zzvv + zzmb) - 50;
          goto _L19
        if (true) goto _L21; else goto _L20
_L21:
        if (true) goto _L18; else goto _L20
_L20:
    }

    public void zzg(Map map)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzvw != null)
                {
                    break label0;
                }
                zzQ("Not an activity context. Cannot resize.");
            }
            return;
        }
        if (zznp.zzah() != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        zzQ("Webview is not yet available, size is not set.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        if (!zznp.zzah().zzpY)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        zzQ("Is interstitial. Cannot resize an interstitial.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!zznp.zzfx())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        zzQ("Cannot resize an expanded banner.");
        obj;
        JVM INSTR monitorexit ;
        return;
        zzf(map);
        if (zzde())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzQ("Invalid width and height options. Cannot resize.");
        obj;
        JVM INSTR monitorexit ;
        return;
        map = zzvw.getWindow();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (map.getDecorView() != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        zzQ("Activity context is not ready, cannot get window or decor view.");
        obj;
        JVM INSTR monitorexit ;
        return;
        int ai[] = zzdf();
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        zzQ("Resize location out of screen or close button is not visible.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        int i;
        int j;
        i = zzj.zzbJ().zzb(zzvw, zzma);
        j = zzj.zzbJ().zzb(zzvw, zzmb);
        obj1 = zznp.getWebView().getParent();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof ViewGroup)) goto _L2; else goto _L3
_L3:
        ((ViewGroup)obj1).removeView(zznp.getWebView());
        if (zzvA != null) goto _L5; else goto _L4
_L4:
        zzvC = (ViewGroup)obj1;
        obj1 = zzh.zzaQ().zzj(zznp.getWebView());
        zzvx = new ImageView(zzvw);
        zzvx.setImageBitmap(((android.graphics.Bitmap) (obj1)));
        zzuO = zznp.zzah();
        zzvC.addView(zzvx);
_L13:
        zzvB = new RelativeLayout(zzvw);
        zzvB.setBackgroundColor(0);
        zzvB.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        zzvA = zzh.zzaQ().zza(zzvB, i, j, false);
        zzvA.setOutsideTouchable(true);
        zzvA.setTouchable(true);
        obj1 = zzvA;
        String s;
        boolean flag;
        if (!zzvr)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj1)).setClippingEnabled(flag);
        zzvB.addView(zznp.getWebView(), -1, -1);
        zzvy = new LinearLayout(zzvw);
        obj1 = new android.widget.RelativeLayout.LayoutParams(zzj.zzbJ().zzb(zzvw, 50), zzj.zzbJ().zzb(zzvw, 50));
        s = zzvq;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 1020
    //                   -1364013995: 767
    //                   -1012429441: 735
    //                   -655373719: 783
    //                   1163912186: 815
    //                   1288627767: 799
    //                   1755462605: 751;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L22:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
_L21:
        zzvy.setOnClickListener(new android.view.View.OnClickListener() {

            final zzdb zzvD;

            public void onClick(View view)
            {
                zzvD.zzn(true);
            }

            
            {
                zzvD = zzdb.this;
                super();
            }
        });
        zzvy.setContentDescription("Close button");
        zzvB.addView(zzvy, ((android.view.ViewGroup.LayoutParams) (obj1)));
        zzvA.showAtLocation(map.getDecorView(), 0, zzj.zzbJ().zzb(zzvw, ai[0]), zzj.zzbJ().zzb(zzvw, ai[1]));
        zzb(ai[0], ai[1]);
        zznp.zza(new AdSizeParcel(zzvw, new AdSize(zzma, zzmb)));
        zzc(ai[0], ai[1]);
        zzS("resized");
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        zzvA.dismiss();
          goto _L13
_L2:
        zzQ("Webview is detached, probably in the middle of a resize or expand.");
        obj;
        JVM INSTR monitorexit ;
        return;
_L8:
        if (!s.equals("top-left")) goto _L6; else goto _L14
_L14:
        i = 0;
          goto _L15
_L12:
        if (!s.equals("top-center")) goto _L6; else goto _L16
_L16:
        i = 1;
          goto _L15
_L7:
        if (!s.equals("center")) goto _L6; else goto _L17
_L17:
        i = 2;
          goto _L15
_L9:
        if (!s.equals("bottom-left")) goto _L6; else goto _L18
_L18:
        i = 3;
          goto _L15
_L11:
        if (!s.equals("bottom-center")) goto _L6; else goto _L19
_L19:
        i = 4;
          goto _L15
_L10:
        if (!s.equals("bottom-right")) goto _L6; else goto _L20
_L20:
        i = 5;
          goto _L15
_L23:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L24:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L25:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
          goto _L21
_L26:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
          goto _L21
_L27:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(14);
          goto _L21
_L28:
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
          goto _L21
        map;
        zzQ((new StringBuilder()).append("Cannot show popup window: ").append(map.getMessage()).toString());
        zzvB.removeView(zznp.getWebView());
        if (zzvC != null)
        {
            zzvC.removeView(zzvx);
            zzvC.addView(zznp.getWebView());
            zznp.zza(zzuO);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        i = -1;
_L15:
        i;
        JVM INSTR tableswitch 0 5: default 1064
    //                   0 831
    //                   1 848
    //                   2 865
    //                   3 875
    //                   4 892
    //                   5 909;
           goto _L22 _L23 _L24 _L25 _L26 _L27 _L28
    }

    public void zzn(boolean flag)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzvA == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        zzvA.dismiss();
        zzvB.removeView(zznp.getWebView());
        if (zzvC != null)
        {
            zzvC.removeView(zzvx);
            zzvC.addView(zznp.getWebView());
            zznp.zza(zzuO);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        zzS("default");
        if (zzvz != null)
        {
            zzvz.zzaq();
        }
        zzvA = null;
        zzvB = null;
        zzvC = null;
        zzvy = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
