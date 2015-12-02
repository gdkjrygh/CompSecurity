// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.aj;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.util.q;
import com.whatsapp.util.s;
import com.whatsapp.util.y;
import com.whatsapp.wallpaper.CropImage;
import com.whatsapp.wallpaper.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, xv, ask, a88, 
//            App, ip, aoh, a1v, 
//            MediaData, ao8, e2, akr, 
//            au6, aoz, PhotoView, od, 
//            jl, alk, a1g, mk, 
//            k, og, af0, qk, 
//            Conversation, v1, afy, jh, 
//            abj, asw, vh, w7, 
//            lf, z0, zj, ContactPicker, 
//            MediaGallery, n7, wd

public class MediaView extends DialogToastActivity
{

    private static final String N[];
    private od A;
    private SeekBar B;
    private s C;
    private c4 D;
    private String E;
    private String F;
    private int G;
    private int H;
    private c4 I;
    private int J;
    private Drawable K;
    private TextView L;
    private int M;
    private ArrayList j;
    private a k;
    private v1 l;
    private w7 m;
    private float n;
    private boolean o;
    private int p;
    private Handler q;
    private MediaViewPager r;
    private ImageButton s;
    private boolean t;
    private float u;
    private wd v;
    private int w;
    private Uri x;
    private int y;
    private android.view.View.OnClickListener z;

    public MediaView()
    {
        M = 0;
        t = true;
        w = 1280;
        v = new xv(this);
        z = new ask(this);
    }

    static float a(MediaView mediaview)
    {
        return mediaview.u;
    }

    static float a(MediaView mediaview, float f1)
    {
        mediaview.n = f1;
        return f1;
    }

    public static int a(int i1)
    {
        switch (i1)
        {
        default:
            return 0x7f0e01a1;

        case 2: // '\002'
            return 0x7f0e0197;

        case 1: // '\001'
            return 0x7f0e019c;

        case 3: // '\003'
            return 0x7f0e01a3;
        }
    }

    static int a(MediaView mediaview, int i1)
    {
        mediaview.p = i1;
        return i1;
    }

    public static Intent a(c4 c4_1, String s1, Context context)
    {
        context = new Intent(context, com/whatsapp/MediaView);
        context.putExtra(N[85], s1);
        context.putExtra(N[84], new a88(c4_1.y));
        return context;
    }

    public static Intent a(c4 c4_1, String s1, Context context, View view)
    {
        context = new Intent(context, com/whatsapp/MediaView);
        context.putExtra(N[93], s1);
        context.putExtra(N[90], new a88(c4_1.y));
        c4_1 = new int[2];
        view.getLocationOnScreen(c4_1);
        context.putExtra("x", c4_1[0]);
        context.putExtra("y", c4_1[1]);
        context.putExtra(N[91], view.getWidth());
        context.putExtra(N[92], view.getHeight());
        context.putExtra(N[89], true);
        return context;
    }

    static PhotoView a(MediaView mediaview, c4 c4_1)
    {
        return mediaview.c(c4_1);
    }

    static ArrayList a(MediaView mediaview, ArrayList arraylist)
    {
        mediaview.j = arraylist;
        return arraylist;
    }

    public static void a(ContentResolver contentresolver, byte abyte0[], long l1)
    {
label0:
        {
            ContentValues contentvalues = new ContentValues();
            Object obj = (new StringBuilder()).append(N[83]).append(l1).append(N[78]).append(N[79]).append(N[72]).append(N[75]).append("'").toString();
            obj = contentresolver.query(android.provider.ContactsContract.Data.CONTENT_URI, null, ((String) (obj)), null, null);
            int i1 = ((Cursor) (obj)).getColumnIndexOrThrow(N[81]);
            if (((Cursor) (obj)).moveToFirst())
            {
                i1 = ((Cursor) (obj)).getInt(i1);
            } else
            {
                i1 = -1;
            }
            ((Cursor) (obj)).close();
            contentvalues.put(N[80], Long.valueOf(l1));
            contentvalues.put(N[76], Integer.valueOf(1));
            contentvalues.put(N[82], abyte0);
            contentvalues.put(N[77], N[73]);
            if (i1 >= 0)
            {
                contentresolver.update(android.provider.ContactsContract.Data.CONTENT_URI, contentvalues, (new StringBuilder()).append(N[74]).append(i1).toString(), null);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            contentresolver.insert(android.provider.ContactsContract.Data.CONTENT_URI, contentvalues);
        }
    }

    private void a(Uri uri, int i1, int j1, int k1)
    {
label0:
        {
            if (uri == null)
            {
                com.whatsapp.wallpaper.d.a(this, true, i1, null, j1, k1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.wallpaper.d.a(this, false, -1, uri, 0, 0);
        }
        c1.a(this, uri);
    }

    static void a(MediaView mediaview, c4 c4_1, int i1)
    {
        mediaview.a(c4_1, i1);
    }

    private void a(c4 c4_1)
    {
        aoh aoh1;
        View view;
        Log.i((new StringBuilder()).append(N[88]).append(c4_1.y.c).toString());
        view = r.findViewWithTag(c4_1.y);
        L = (TextView)view.findViewById(0x7f0b0231);
        B = (SeekBar)view.findViewById(0x7f0b018e);
        B.setOnSeekBarChangeListener(new ip(this, null));
        s = (ImageButton)view.findViewById(0x7f0b0230);
        aoh1 = new aoh(this, B, s);
        s.setOnClickListener(aoh1);
        view = view.findViewById(0x7f0b0232);
        int i1;
        if (!t)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        view.setOnClickListener(aoh1);
        i1 = App.am;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        boolean flag;
        try
        {
            view.setOnClickListener(new a1v(this, aoh1));
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (C == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        flag = C.f();
        if (flag)
        {
            try
            {
                C.g();
            }
            // Misplaced declaration of an exception variable
            catch (c4 c4_1)
            {
                throw c4_1;
            }
        }
        C.d();
        C = null;
        try
        {
            C = com.whatsapp.util.s.a(((MediaData)c4_1.B).file.getAbsolutePath());
            C.a(new ao8(this));
            C.c();
            Log.i((new StringBuilder()).append(N[87]).append(C.a()).toString());
            M = 5;
            L.setText(DateUtils.formatElapsedTime(C.a() / 1000));
            B.setMax(C.a());
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            Log.a(c4_1);
            a(0x7f0e0196, ((c9) (new e2(this))));
        }
        B.setProgress(0);
        s.setImageResource(0x7f0205d3);
        return;
        c4_1;
        throw c4_1;
        c4_1;
        throw c4_1;
    }

    private void a(c4 c4_1, int i1)
    {
label0:
        {
            int j1 = App.am;
            String s1 = N[34];
            akr.o();
            MediaData mediadata = (MediaData)c4_1.B;
            if (c4_1.w == 3)
            {
                Intent intent = new Intent(N[33]);
                intent.setDataAndType(Uri.fromFile(mediadata.file), N[37]);
                if (Build.MANUFACTURER.startsWith(N[39]))
                {
                    Object obj = App.au.getPackageManager().queryIntentActivities(intent, 0);
                    if (obj != null)
                    {
                        obj = ((List) (obj)).iterator();
                        do
                        {
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
                            Log.i((new StringBuilder()).append(resolveinfo.activityInfo.packageName).append(N[38]).append(resolveinfo.activityInfo.name).toString());
                            if (resolveinfo.activityInfo.name.equals(N[40]))
                            {
                                intent.setClassName(N[36], N[35]);
                            }
                        } while (j1 == 0);
                    }
                }
                com.whatsapp.App.a(this, intent);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (c4_1.w == 2)
            {
                a(c4_1);
                if (C != null)
                {
                    M = 4;
                    q.sendEmptyMessage(0);
                    s.setImageResource(0x7f0205d2);
                    App.p(this);
                    C.i();
                    if (i1 > 0)
                    {
                        C.b(i1);
                        B.setProgress(C.b());
                    }
                }
            }
        }
    }

    private void a(Runnable runnable)
    {
        if (!c())
        {
            return;
        }
        MediaViewPager mediaviewpager = r;
        c4 c4_1 = b(r.getCurrentItem());
        if (getResources().getConfiguration().orientation != G || c4_1 == null || !c4_1.y.equals(k))
        {
            mediaviewpager.setPivotX(mediaviewpager.getWidth() / 2);
            mediaviewpager.setPivotY(mediaviewpager.getHeight() / 2);
            y = 0;
            J = 0;
        }
        mediaviewpager.animate().setDuration(240L).scaleX(n).scaleY(u).translationX(y).translationY(J).alpha(0.0F).setListener(new au6(this, runnable));
        runnable = ObjectAnimator.ofInt(K, N[86], new int[] {
            255, 0
        });
        runnable.setDuration(240L);
        runnable.setInterpolator(new DecelerateInterpolator());
        runnable.start();
    }

    private void a(boolean flag)
    {
        int i1;
        boolean flag1;
        byte byte0;
        int j1;
        int k1;
        byte0 = 8;
        flag1 = true;
        k1 = App.am;
        Object obj;
        MediaData mediadata;
        Object obj1;
        OutOfMemoryError outofmemoryerror1;
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            obj = b(p);
            mediadata = (MediaData)((c4) (obj)).B;
            obj1 = new ExifInterface(mediadata.file.getAbsolutePath());
            j1 = ((ExifInterface) (obj1)).getAttributeInt(N[9], 1);
        }
        catch (IOException ioexception)
        {
            Log.a(N[7], ioexception);
            return;
        }
        i1 = j1;
        j1;
        JVM INSTR tableswitch 0 8: default 310
    //                   0 318
    //                   1 318
    //                   2 116
    //                   3 343
    //                   4 116
    //                   5 116
    //                   6 331
    //                   7 116
    //                   8 356;
           goto _L1 _L2 _L2 _L3 _L4 _L3 _L3 _L5 _L3 _L6
_L3:
        ((ExifInterface) (obj1)).setAttribute(N[10], Integer.toString(i1));
        ((ExifInterface) (obj1)).saveAttributes();
        obj1 = c1.a(Uri.fromFile(mediadata.file), 100, 100);
        bytearrayoutputstream = new ByteArrayOutputStream();
        ((Bitmap) (obj1)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
        ((c4) (obj)).a(bytearrayoutputstream.toByteArray());
        ((Bitmap) (obj1)).recycle();
_L9:
        mediadata.fileSize = mediadata.file.length();
        mediadata.faceX = 0;
        mediadata.faceY = 0;
        com.whatsapp.util.y.b(((c4) (obj)));
        App.ah.e(((c4) (obj)));
        obj = c(((c4) (obj)));
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        ((PhotoView) (obj)).c();
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        ((PhotoView) (obj)).a();
        ((PhotoView) (obj)).requestLayout();
        ((PhotoView) (obj)).invalidate();
        return;
        outofmemoryerror1;
        Log.a(N[8], outofmemoryerror1);
          goto _L9
        aj aj1;
        aj1;
        Log.a(N[6], aj1);
          goto _L9
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        throw outofmemoryerror;
        outofmemoryerror;
        throw outofmemoryerror;
_L1:
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        return;
_L2:
        if (flag)
        {
            i1 = 6;
        } else
        {
            i1 = 8;
        }
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 1;
        }
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 6;
        }
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 3;
        }
        if (true) goto _L3; else goto _L10
_L10:
    }

    static boolean a(MediaView mediaview, boolean flag)
    {
        mediaview.o = flag;
        return flag;
    }

    static float b(MediaView mediaview, float f1)
    {
        mediaview.u = f1;
        return f1;
    }

    private View b(c4 c4_1)
    {
        int i1;
label0:
        {
            i1 = 0;
            int j1 = App.am;
            Object obj;
            if (c4_1.w == 2)
            {
                obj = (ViewGroup)getLayoutInflater().inflate(0x7f030080, null);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            Object obj1 = (ViewGroup)getLayoutInflater().inflate(0x7f030082, null);
            _cls15 _lcls15 = new _cls15(this);
            ((ViewGroup) (obj1)).addView(_lcls15, 0);
            _lcls15.setInitialFitTolerance(0.2F);
            Bitmap bitmap;
            boolean flag;
            if (c4_1.w == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _lcls15.b(flag);
            if (c4_1.w == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _lcls15.setIsVideo(flag);
            obj = (MediaData)c4_1.B;
            if (!c4_1.y.b && !((MediaData) (obj)).transferred)
            {
                com.whatsapp.App.a(this, getString(a(c4_1.w)));
            }
            bitmap = com.whatsapp.util.y.a(c4_1);
            _lcls15.a(bitmap);
            if (A != null)
            {
                A.a(c4_1, _lcls15);
            }
            if (c4_1.w == 1)
            {
                if (bitmap == null)
                {
                    _lcls15.a(((BitmapDrawable)getResources().getDrawable(0x7f020088)).getBitmap());
                }
                _lcls15.setOnClickListener(new jl(this));
                obj = obj1;
                if (j1 == 0)
                {
                    break label0;
                }
            }
            obj = obj1;
            if (c4_1.w == 3)
            {
                if (bitmap == null)
                {
                    _lcls15.a(((BitmapDrawable)getResources().getDrawable(0x7f02008b)).getBitmap());
                }
                _lcls15.setOnClickListener(new alk(this, c4_1));
                obj = obj1;
            }
        }
label1:
        {
            obj1 = (TextView)((ViewGroup) (obj)).findViewById(0x7f0b0182);
            com.whatsapp.a1g.a(((TextView) (obj1)));
            if (TextUtils.isEmpty(c4_1.b))
            {
                ((TextView) (obj1)).setVisibility(8);
                if (j1 == 0)
                {
                    break label1;
                }
            }
            ((TextView) (obj1)).setText(com.whatsapp.util.c.b(c4_1.b, getBaseContext(), ((TextView) (obj1)).getPaint()));
            ((TextView) (obj1)).setVisibility(0);
        }
label2:
        {
            obj1 = (TextView)((ViewGroup) (obj)).findViewById(0x7f0b0233);
            if (c4_1.y.b)
            {
                ((TextView) (obj1)).setText(getString(0x7f0e0445, new Object[] {
                    getString(0x7f0e04b8), com.whatsapp.util.q.b(this, com.whatsapp.App.q(c4_1))
                }));
                if (j1 == 0)
                {
                    break label2;
                }
            }
            if (mk.h(c4_1.y.a) && c4_1.G != null)
            {
                ((TextView) (obj1)).setText(getString(0x7f0e0445, new Object[] {
                    com.whatsapp.util.c.b(App.az.e(c4_1.G).a(this), getBaseContext()), com.whatsapp.util.q.b(this, com.whatsapp.App.q(c4_1))
                }));
                if (j1 == 0)
                {
                    break label2;
                }
            }
            ((TextView) (obj1)).setText(getString(0x7f0e0445, new Object[] {
                com.whatsapp.util.c.b(App.az.e(F).a(this), getBaseContext()), com.whatsapp.util.q.b(this, com.whatsapp.App.q(c4_1))
            }));
        }
label3:
        {
            c4_1 = (TextView)((ViewGroup) (obj)).findViewById(0x7f0b0234);
            if (mk.h(F))
            {
                c4_1.setVisibility(0);
                c4_1.setText(com.whatsapp.util.c.b(App.az.e(F).a(this), getBaseContext(), c4_1.getPaint()));
                if (j1 == 0)
                {
                    break label3;
                }
            }
            c4_1.setVisibility(8);
        }
        c4_1 = ((ViewGroup) (obj)).findViewById(0x7f0b0148);
        if (!t)
        {
            i1 = 8;
        }
        c4_1.setVisibility(i1);
        return ((View) (obj));
    }

    private c4 b(int i1)
    {
        int j1 = j.size();
        c4 c4_1 = null;
        if (i1 < j1)
        {
            c4_1 = (c4)j.get(j1 - i1 - 1);
        }
        return c4_1;
    }

    static c4 b(MediaView mediaview, int i1)
    {
        return mediaview.b(i1);
    }

    static void b(MediaView mediaview, c4 c4_1)
    {
        mediaview.a(c4_1);
    }

    static void b(MediaView mediaview, boolean flag)
    {
        mediaview.b(flag);
    }

    private void b(boolean flag)
    {
        int j1;
        j1 = App.am;
        break MISSING_BLOCK_LABEL_5;
_L2:
        int i1;
        int k1;
        do
        {
            return;
        } while (o || t == flag);
        t = flag;
        k1 = r.getChildCount();
        i1 = 0;
_L3:
        if (i1 < k1)
        {
            View view = r.getChildAt(i1).findViewById(0x7f0b0148);
            AlphaAnimation alphaanimation;
            if (flag)
            {
                alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                view.setVisibility(0);
            } else
            {
                alphaanimation = new AlphaAnimation(1.0F, 0.0F);
                view.setVisibility(4);
            }
            alphaanimation.setDuration(400L);
            view.setAnimation(alphaanimation);
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_176;
            }
        }
        if (flag)
        {
            getSupportActionBar().show();
            if (j1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        getSupportActionBar().hide();
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L2; else goto _L1
_L1:
        j1 = w;
        i1 = j1;
        if (!flag)
        {
            i1 = j1 | 5;
        }
        r.setSystemUiVisibility(i1);
        return;
        i1++;
          goto _L3
    }

    static boolean b(MediaView mediaview)
    {
        return mediaview.t;
    }

    static int c(MediaView mediaview, int i1)
    {
        mediaview.M = i1;
        return i1;
    }

    static View c(MediaView mediaview, c4 c4_1)
    {
        return mediaview.b(c4_1);
    }

    private PhotoView c(c4 c4_1)
    {
        c4_1 = r.findViewWithTag(c4_1.y);
        if (c4_1 != null && (c4_1 instanceof ViewGroup))
        {
            c4_1 = ((ViewGroup)c4_1).getChildAt(0);
            if (c4_1 != null && (c4_1 instanceof PhotoView))
            {
                return (PhotoView)c4_1;
            }
        }
        return null;
    }

    static a c(MediaView mediaview)
    {
        return mediaview.k;
    }

    private void c(int i1)
    {
        c4 c4_1 = b(p);
        if (c4_1 == null)
        {
            return;
        } else
        {
            a(c4_1, i1);
            return;
        }
    }

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 12;
    }

    static int d(MediaView mediaview, int i1)
    {
        mediaview.y = i1;
        return i1;
    }

    static String d(MediaView mediaview)
    {
        return mediaview.F;
    }

    private void d()
    {
        Intent intent;
        Object obj;
        int i1;
        i1 = App.am;
        obj = b(p);
        intent = new Intent(N[5]);
        ((c4) (obj)).w;
        JVM INSTR tableswitch 1 3: default 56
    //                   1 119
    //                   2 91
    //                   3 105;
           goto _L1 _L2 _L3 _L4
_L1:
        obj = (MediaData)((c4) (obj)).B;
        intent.putExtra(N[1], Uri.fromFile(((MediaData) (obj)).file));
        startActivity(Intent.createChooser(intent, null));
        return;
_L3:
        intent.setType(N[2]);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        intent.setType(N[4]);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        intent.setType(N[3]);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void d(int i1)
    {
label0:
        {
            f();
            if (i1 == 1)
            {
                if (p <= 0)
                {
                    break label0;
                }
                p = p - 1;
                r.setCurrentItem(p);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (p < j.size() - 1)
            {
                p = p + 1;
                r.setCurrentItem(p);
            }
        }
    }

    static SeekBar e(MediaView mediaview)
    {
        return mediaview.B;
    }

    private void e(int i1)
    {
        c4 c4_1;
label0:
        {
            c4_1 = b(i1);
            if (c4_1 != null && c4_1.w == 2)
            {
                if (I != null && I.y.equals(c4_1.y))
                {
                    break label0;
                }
                a(c4_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            f();
        }
        if (p != i1 && I != null && I.y != null)
        {
            PhotoView photoview = c(c4_1);
            if (photoview != null)
            {
                photoview.b();
            }
        }
        I = c4_1;
        p = i1;
        f(i1);
    }

    static void e(MediaView mediaview, int i1)
    {
        mediaview.d(i1);
    }

    static int f(MediaView mediaview, int i1)
    {
        mediaview.H = i1;
        return i1;
    }

    private void f()
    {
        if (C != null)
        {
            if (C.f())
            {
                C.g();
            }
            C.d();
            C = null;
            M = 0;
        }
        if (B != null)
        {
            B.setProgress(0);
        }
        if (s != null)
        {
            s.setImageResource(0x7f0205d3);
        }
        if (L != null)
        {
            L.setText(DateUtils.formatElapsedTime(0L));
        }
    }

    private void f(int i1)
    {
        if (b(i1) == null)
        {
            return;
        } else
        {
            getSupportActionBar().setTitle(getString(0x7f0e023c, new Object[] {
                Integer.valueOf(i1 + 1), Integer.valueOf(j.size())
            }));
            invalidateOptionsMenu();
            return;
        }
    }

    static void f(MediaView mediaview)
    {
        mediaview.f();
    }

    static int g(MediaView mediaview, int i1)
    {
        mediaview.J = i1;
        return i1;
    }

    static ImageButton g(MediaView mediaview)
    {
        return mediaview.s;
    }

    private void g()
    {
        if (!c())
        {
            return;
        }
        G = getResources().getConfiguration().orientation;
        Object obj = ObjectAnimator.ofInt(K, N[31], new int[] {
            0, 255
        });
        ((ObjectAnimator) (obj)).setDuration(240L);
        ((ObjectAnimator) (obj)).setInterpolator(new AccelerateInterpolator());
        ((ObjectAnimator) (obj)).start();
        obj = r;
        ((View) (obj)).setPivotX(0.0F);
        ((View) (obj)).setPivotY(0.0F);
        ((View) (obj)).setScaleX(n);
        ((View) (obj)).setScaleY(u);
        ((View) (obj)).setTranslationX(y);
        ((View) (obj)).setTranslationY(J);
        View view = r.findViewWithTag(D.y);
        if (view != null)
        {
            view.setAlpha(0.0F);
            view.animate().setDuration(120L).alpha(1.0F).setInterpolator(new DecelerateInterpolator(2.0F));
        }
        ((View) (obj)).animate().setDuration(240L).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setListener(new af0(this));
    }

    static s h(MediaView mediaview)
    {
        return mediaview.C;
    }

    static void h(MediaView mediaview, int i1)
    {
        mediaview.e(i1);
    }

    static float i(MediaView mediaview)
    {
        return mediaview.n;
    }

    static void i(MediaView mediaview, int i1)
    {
        mediaview.c(i1);
    }

    static w7 j(MediaView mediaview)
    {
        return mediaview.m;
    }

    static int k(MediaView mediaview)
    {
        return mediaview.y;
    }

    static int l(MediaView mediaview)
    {
        return mediaview.H;
    }

    static ArrayList m(MediaView mediaview)
    {
        return mediaview.j;
    }

    static String n(MediaView mediaview)
    {
        return mediaview.E;
    }

    static int o(MediaView mediaview)
    {
        return mediaview.p;
    }

    static MediaViewPager p(MediaView mediaview)
    {
        return mediaview.r;
    }

    static int q(MediaView mediaview)
    {
        return mediaview.J;
    }

    static void r(MediaView mediaview)
    {
        mediaview.g();
    }

    static int s(MediaView mediaview)
    {
        return mediaview.M;
    }

    static TextView t(MediaView mediaview)
    {
        return mediaview.L;
    }

    static Handler u(MediaView mediaview)
    {
        return mediaview.q;
    }

    public void e()
    {
        App.aT();
        System.gc();
        App.aT();
    }

    public void finish()
    {
        super.finish();
        if (c() && D != null)
        {
            overridePendingTransition(0, 0);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        int l1 = App.am;
        i1;
        JVM INSTR tableswitch 0 6: default 48
    //                   0 49
    //                   1 127
    //                   2 413
    //                   3 81
    //                   4 610
    //                   5 691
    //                   6 748;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        if (j1 != -1 || intent == null || intent.getData() == null) goto _L1; else goto _L9
_L9:
        a(intent.getData(), -1, 0, 0);
        if (l1 == 0) goto _L1; else goto _L5
_L5:
        if (j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!qk.b(App.az.f(), this)) goto _L1; else goto _L10
_L10:
        showDialog(0);
        if (l1 == 0) goto _L1; else goto _L11
_L11:
        if (j1 != 0 || intent == null) goto _L1; else goto _L12
_L12:
        com.whatsapp.qk.a(intent, this);
        if (l1 == 0) goto _L1; else goto _L3
_L3:
        if (j1 != -1 || intent == null || !intent.hasExtra(N[20])) goto _L1; else goto _L13
_L13:
        Bitmap bitmap;
        bitmap = (Bitmap)intent.getParcelableExtra(N[25]);
        Log.i((new StringBuilder()).append(N[13]).append(bitmap.getWidth()).append(N[23]).append(x).toString());
        if (Uri.withAppendedPath(x, N[22]) == null) goto _L1; else goto _L14
_L14:
        Object obj = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (obj)));
        byte abyte0[] = ((ByteArrayOutputStream) (obj)).toByteArray();
        long l2 = ContentUris.parseId(x);
        obj = getContentResolver();
        Uri uri1 = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        String s1 = N[29];
        String s2 = N[15];
        obj = ((ContentResolver) (obj)).query(uri1, new String[] {
            s1
        }, s2, new String[] {
            String.valueOf(l2)
        }, null);
        i1 = 0;
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            long l3 = ((Cursor) (obj)).getLong(0);
            int k1 = i1;
            if (i1 == 0)
            {
                a(com.whatsapp.App.d, abyte0, l3);
                k1 = 1;
            }
            Log.i((new StringBuilder()).append(N[26]).append(l3).toString());
            i1 = k1;
        } while (l1 == 0);
        ((Cursor) (obj)).close();
        if (l1 == 0) goto _L1; else goto _L4
_L4:
        if (j1 != -1 || intent == null) goto _L1; else goto _L15
_L15:
        x = intent.getData();
        Uri uri = Uri.fromFile(((MediaData)b(p).B).file);
        i1 = (int)App.au.getResources().getDimension(0x7f0a0059);
        Intent intent2 = new Intent(this, com/whatsapp/wallpaper/CropImage);
        intent2.putExtra(N[24], i1);
        intent2.putExtra(N[17], i1);
        intent2.putExtra(N[14], 1);
        intent2.putExtra(N[30], true);
        intent2.putExtra(N[11], true);
        intent2.putExtra(N[27], true);
        intent2.setData(uri);
        intent2.putExtra(N[12], com.whatsapp.wallpaper.d.a());
        intent2.putExtra(N[19], android.graphics.Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(intent2, 1);
        if (l1 == 0) goto _L1; else goto _L6
_L6:
        if (j1 != -1 || intent == null) goto _L1; else goto _L16
_L16:
        E = intent.getStringExtra(N[21]);
        Intent intent1 = new Intent();
        intent1.setData(Uri.fromFile(((MediaData)b(p).B).file));
        com.whatsapp.qk.a(intent1, App.az.c(E), this, 5, this);
        if (l1 == 0) goto _L1; else goto _L7
_L7:
        if (j1 != -1 || E == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!qk.b(App.az.c(E), this)) goto _L1; else goto _L17
_L17:
        showDialog(1);
        if (l1 == 0) goto _L1; else goto _L18
_L18:
        if (j1 != 0 || intent == null) goto _L1; else goto _L19
_L19:
        com.whatsapp.qk.a(intent, this);
        if (l1 == 0) goto _L1; else goto _L8
_L8:
        if (j1 != -1 || intent == null) goto _L1; else goto _L20
_L20:
        c4 c4_1 = b(p);
        if (c4_1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = App.az.e(intent.getStringExtra(N[28]));
        if (intent != null)
        {
            com.whatsapp.App.a(c4_1, intent);
            startActivity(com.whatsapp.Conversation.a(intent));
            if (l1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        Log.w(N[18]);
        App.b(this, 0x7f0e0210, 0);
        if (l1 == 0) goto _L1; else goto _L21
_L21:
        Log.w(N[16]);
        App.b(this, 0x7f0e0255, 0);
        return;
    }

    public void onBackPressed()
    {
label0:
        {
            if (c() && D != null)
            {
                if (A != null)
                {
                    A.interrupt();
                    A = null;
                }
                if (l != null)
                {
                    l.a();
                    l = null;
                }
                a(new afy(this));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b(true);
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        Intent intent;
        obj1 = null;
        Log.i(N[54]);
        super.onCreate(bundle);
        App.aT();
        requestWindowFeature(5L);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(new jh(this));
        try
        {
            setContentView(getLayoutInflater().inflate(0x7f03007f, null, false));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e((new StringBuilder()).append(N[42]).append(Debug.getNativeHeapAllocatedSize() / 1024L).append(N[49]).toString());
            c1.a();
            a(0x7f0e015d, new abj(this));
            return;
        }
        intent = getIntent();
        if (intent == null)
        {
            try
            {
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        A = new od(this, null);
        A.start();
        F = intent.getStringExtra(N[45]);
        com.whatsapp.util.y.a(F);
        obj = (a88)intent.getParcelableExtra(N[53]);
        if (obj == null) goto _L2; else goto _L1
_L1:
        c4 c4_1;
        k = ((a88) (obj)).a;
        j = new ArrayList();
        Log.i((new StringBuilder()).append(N[47]).append(k.a).append(N[46]).append(k.b).append(N[50]).append(k.c).toString());
        c4_1 = App.ah.a(k);
        if (c4_1 == null)
        {
            try
            {
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        j.add(c4_1);
        if (c4_1.w == 2) goto _L4; else goto _L3
_L3:
        byte byte0 = c4_1.w;
        if (byte0 != 3) goto _L5; else goto _L4
_L4:
        obj = c4_1;
_L8:
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setSupportProgressBarIndeterminateVisibility(true);
        l = new v1(this);
        com.whatsapp.asw.a(l, new Void[0]);
_L6:
        Log.i((new StringBuilder()).append(N[48]).append(k).toString());
        p = 0;
        PhotoView.E = ((BitmapDrawable)getResources().getDrawable(0x7f0205d5)).getBitmap();
        q = new vh(this);
        if (bundle != null)
        {
            obj = obj1;
        }
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        try
        {
            I = ((c4) (obj));
            m = new w7(this, ((c4) (obj)));
            r = new MediaViewPager(this, null);
            ((ViewGroup)findViewById(0x7f0b022f)).addView(r);
            r.setAdapter(m);
            f(p);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                r.setSystemUiVisibility(w);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        obj = findViewById(0x7f0b022f);
        try
        {
            K = new ColorDrawable(0xff000000);
            ((View) (obj)).setBackgroundDrawable(K);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle) { }
            try
            {
                throw bundle;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        if (bundle != null || c4_1 == null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        i1 = c4_1.w;
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        if (!c())
        {
            break MISSING_BLOCK_LABEL_722;
        }
        flag = intent.getBooleanExtra(N[44], false);
        if (flag)
        {
            D = c4_1;
            o = true;
            obj = r;
            i1 = intent.getIntExtra("x", 0);
            j1 = intent.getIntExtra("y", 0);
            k1 = intent.getIntExtra(N[52], 0);
            l1 = intent.getIntExtra(N[51], 0);
            getSupportActionBar().hide();
            t = false;
            ((View) (obj)).getViewTreeObserver().addOnPreDrawListener(new lf(this, ((View) (obj)), i1, j1, k1, l1));
        }
        if (bundle != null)
        {
            try
            {
                x = (Uri)bundle.getParcelable(N[55]);
                E = bundle.getString(N[43]);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        App.b(v);
        return;
        bundle;
        throw bundle;
_L2:
        j = App.ah.x(F);
        c4_1 = null;
        obj = null;
          goto _L6
_L5:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Dialog onCreateDialog(int i1)
    {
        boolean flag = true;
        c4 c4_1;
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 0: // '\0'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e045a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 1: // '\001'
            ProgressDialog progressdialog1 = new ProgressDialog(this);
            progressdialog1.setMessage(getString(0x7f0e0459));
            progressdialog1.setIndeterminate(true);
            progressdialog1.setCancelable(false);
            return progressdialog1;

        case 2: // '\002'
            c4_1 = b(p);
            break;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(c4_1);
        if (p != j.size() - 1)
        {
            flag = false;
        }
        return com.whatsapp.zj.a(this, arraylist, F, 2, new z0(this, c4_1, flag));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 8, 0, 0x7f0e0035).setIcon(0x7f0205ca).setShowAsAction(2);
        menu.add(0, 10, 0, 0x7f0e00f4).setIcon(0x7f02050b).setShowAsAction(2);
        menu.add(0, 9, 0, 0x7f0e03d1).setIcon(0x7f020519);
        menu.add(1, 5, 0, 0x7f0e0389).setIcon(0x7f02053b);
        menu.add(1, 6, 0, 0x7f0e0387).setIcon(0x7f020541);
        menu.add(1, 0, 0, 0x7f0e004e).setIcon(0x7f02053b);
        menu.add(1, 1, 0, 0x7f0e045e).setIcon(0x7f020554);
        menu.add(1, 2, 0, 0x7f0e0481).setIcon(0x7f020544);
        menu.add(1, 3, 0, 0x7f0e0362).setIcon(0x7f02054c);
        menu.add(1, 4, 0, 0x7f0e0363).setIcon(0x7f02054d);
        menu.add(0, 7, 0, 0x7f0e010e).setIcon(0x7f02053f);
        return true;
    }

    public void onDestroy()
    {
        int j1;
        j1 = App.am;
        Log.i(N[41]);
        if (r == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= r.getChildCount()) goto _L2; else goto _L3
_L3:
        View view = r.getChildAt(i1);
        if (view instanceof PhotoView)
        {
            ((PhotoView)view).d();
        }
        if (j1 == 0) goto _L4; else goto _L2
_L2:
        if (A != null)
        {
            A.interrupt();
            A = null;
        }
        if (l != null)
        {
            l.a();
            l = null;
        }
        I = null;
        if (F != null)
        {
            com.whatsapp.util.y.c(F);
        }
        com.whatsapp.App.a(v);
        App.aT();
        super.onDestroy();
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int k1 = App.am;
        menuitem.getItemId();
        JVM INSTR lookupswitch 12: default 116
    //                   0: 407
    //                   1: 118
    //                   2: 519
    //                   3: 590
    //                   4: 600
    //                   5: 433
    //                   6: 484
    //                   7: 610
    //                   8: 665
    //                   9: 620
    //                   10: 629
    //                   16908332: 706;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        return true;
_L3:
        if (getResources().getConfiguration().orientation != 1) goto _L15; else goto _L14
_L14:
        int i1;
        int j1;
        int l1;
        int i2;
        j1 = getWindow().getDecorView().getHeight();
        l1 = (int)getResources().getDimension(0x7f0a003d);
        i2 = com.whatsapp.a1g.a().c();
        i1 = getWindow().getDecorView().getWidth();
        if (k1 == 0) goto _L16; else goto _L15
_L15:
        j1 = getWindow().getDecorView().getWidth();
        l1 = (int)getResources().getDimension(0x7f0a003d);
        i2 = com.whatsapp.a1g.a().c();
        i1 = getWindow().getDecorView().getHeight();
        j1 = j1 - l1 - i2;
_L20:
        menuitem = Uri.fromFile(((MediaData)b(p).B).file);
        Log.i((new StringBuilder()).append(N[58]).append(j1).toString());
        Intent intent = new Intent(this, com/whatsapp/wallpaper/CropImage);
        intent.putExtra(N[70], i1);
        intent.putExtra(N[68], j1);
        intent.putExtra(N[65], 1);
        intent.putExtra(N[67], true);
        intent.putExtra(N[63], true);
        intent.setData(menuitem);
        intent.putExtra(N[71], com.whatsapp.wallpaper.d.a());
        intent.putExtra(N[60], android.graphics.Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(intent, 0);
        if (k1 == 0) goto _L1; else goto _L2
_L2:
        startActivityForResult(new Intent(N[64], android.provider.ContactsContract.Contacts.CONTENT_URI), 2);
        if (k1 == 0) goto _L1; else goto _L7
_L7:
        menuitem = new Intent();
        menuitem.setData(Uri.fromFile(((MediaData)b(p).B).file));
        com.whatsapp.qk.a(menuitem, App.az.f(), this, 3, this);
        if (k1 == 0) goto _L1; else goto _L8
_L8:
        menuitem = new Intent(this, com/whatsapp/ContactPicker);
        menuitem.putExtra(N[62], true);
        startActivityForResult(menuitem, 4);
        if (k1 == 0) goto _L1; else goto _L4
_L4:
        Uri uri;
        Intent intent1;
        menuitem = b(p);
        uri = Uri.fromFile(((MediaData)((c4) (menuitem)).B).file);
        intent1 = new Intent(N[61]);
        ((c4) (menuitem)).w;
        JVM INSTR tableswitch 1 1: default 580
    //                   1 742;
           goto _L17 _L18
_L17:
        com.whatsapp.App.a(this, intent1);
        if (k1 == 0) goto _L1; else goto _L5
_L5:
        a(false);
        if (k1 == 0) goto _L1; else goto _L6
_L6:
        a(true);
        if (k1 == 0) goto _L1; else goto _L9
_L9:
        showDialog(2);
        if (k1 == 0) goto _L1; else goto _L11
_L11:
        d();
        if (k1 == 0) goto _L1; else goto _L12
_L12:
        menuitem = new Intent(this, com/whatsapp/ContactPicker);
        menuitem.putExtra(N[66], true);
        startActivityForResult(menuitem, 6);
        if (k1 == 0) goto _L1; else goto _L10
_L10:
        menuitem = new Intent(this, com/whatsapp/MediaGallery);
        menuitem.putExtra(N[69], F);
        startActivity(menuitem);
        finish();
        if (k1 == 0) goto _L1; else goto _L13
_L13:
        if (!c() || D == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a(new n7(this));
        if (k1 == 0) goto _L1; else goto _L19
_L19:
        finish();
        return true;
_L18:
        intent1.setDataAndType(uri, N[59]);
          goto _L17
_L16:
        j1 = j1 - l1 - i2;
          goto _L20
    }

    protected void onPause()
    {
        super.onPause();
        if (isFinishing() && l != null)
        {
            l.a();
            l = null;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = false;
        if (r == null) goto _L2; else goto _L1
_L1:
        c4 c4_1 = b(r.getCurrentItem());
        if (c4_1 == null || c4_1.w != 1) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        menu.setGroupVisible(1, flag);
        MenuItem menuitem = menu.findItem(7);
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menuitem = menu.findItem(9);
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menuitem = menu.findItem(10);
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menu = menu.findItem(8);
        flag = flag1;
        if (r != null)
        {
            flag = true;
        }
        menu.setVisible(flag);
        return true;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onResume()
    {
        super.onResume();
        b(true);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (x != null)
        {
            bundle.putParcelable(N[56], x);
        }
        if (E != null)
        {
            bundle.putString(N[57], E);
        }
    }

    protected void onStart()
    {
        super.onStart();
        Log.i(N[0]);
    }

    protected void onStop()
    {
        super.onStop();
        f();
        b(true);
        Log.i(N[32]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[94];
        obj = "L$\016&\034W(\0178RR5\013=\t";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "@/\016=\022H%D&\023U$\004;SD9\036=\034\017\022>\0358`\f";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "@4\016&\022\016k";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "H,\013(\030\016k";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "W(\016*\022\016k";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "@/\016=\022H%D&\023U$\004;S@\"\036&\022Oo9\n3e";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "L$\016&\034W(\0178RS.\036.\tDn\030*\036S$\013;\030U)\037\"\037";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "L$\016&\034W(\0178RS.\036.\tD";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "L$\016&\034W(\0178RS.\036.\tDn\030*\036S$\013;\030U)\037\"\037";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "n3\003*\023U \036&\022O";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "n3\003*\023U \036&\022O";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "B3\005??X\016\037;\rT59&\007D";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "N4\036?\bU";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "L$\016&\034W(\0178R@7\013;\034S\036\035&\031U)P";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "R\"\013#\030";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "B.\004;\034B55&\031\034~";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "L$\016&\034W(\0178RG.\0308\034S%E)\034H-\017+";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "N4\036?\bU\030";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "L$\016&\034W(\0178RG.\0308\034S%E&\023W \006&\031\f,\017<\016@&\017";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "N4\036?\bU\007\005=\020@5";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "E \036.";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "B.\004;\034B5";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "Q)\005;\022";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\001=J";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "N4\036?\bU\031";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "E \036.";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "L$\016&\034W(\0178RS \035\020\036N/\036.\036U\036\003+G";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "S$\036:\017Ol\016.\t@";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "B.\004;\034B5";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "~(\016";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "R\"\013#\030t1#)3D$\016*\031";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "@-\032'\034";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "L$\016&\034W(\0178RR5\005?";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                obj = "@/\016=\022H%D&\023U$\004;S@\"\036&\022Oo<\0068v";
                byte0 = 32;
                i1 = 33;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "r.\0046";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "B.\007a\016N/\023*\017H\"\031<\022Oo\r.\021M$\0306Sl.\034&\030w(\0178";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "B.\007a\016N/\023*\017H\"\031<\022Oo\r.\021M$\0306";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "W(\016*\022\016k";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\001=J";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "r.\0046";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "B.\007a\016N/\023*\017H\"\031<\022Oo\r.\021M$\0306Sl.\034&\030w(\0178";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "L$\016&\034W(\0178RE$\031;\017N8";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "L$\016&\034W(\0178RN/\t=\030@5\017`\022N,E'\030@1J<\024[$P";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "F(\016";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "I \031\020\034O(\007.\tH.\004";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "K(\016";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "\001,\017u";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "L$\016&\034W(\0178RG.\037!\031\f*\0176]";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "L$\016&\034W(\0178RW(\0178]L$\031<\034F$P";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\001*(";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\001(\016u";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "I$\003(\025U";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "V(\016;\025";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "J$\023";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "L$\016&\034W(\0178RB3\017.\tD";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "B.\004;\034B55:\017H";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "B.\004;\034B55:\017H";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "F(\016";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "L$\016&\034W(\0178RV \006#\r@1\017=RB3\005?RI$\003(\025U{";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "H,\013(\030\016k";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "N4\036?\bU\007\005=\020@5";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "@/\016=\022H%D&\023U$\004;S@\"\036&\022Oo<\0068v";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "R$\036\020\032S.\037?\"H\"\005!";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "B3\005??X\016\037;\rT59&\007D";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "@/\016=\022H%D&\023U$\004;S@\"\036&\022Oo:\006>j";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                obj = "R\"\013#\030";
                byte0 = 64;
                i1 = 65;
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "G.\0308\034S%";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "R\"\013#\030t1#)3D$\016*\031";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "N4\036?\bU\030";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = "K(\016";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "N4\036?\bU\031";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "N4\036?\bU";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "\034|M";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "W/\016a\034O%\030 \024Eo\t:\017R.\030a\024U$\007`\rI.\036 ";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "~(\016o@\001";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "W/\016a\034O%\030 \024Eo\t:\017R.\030a\024U$\007`\rI.\036 ";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "H25<\bQ$\030\020\rS(\007.\017X";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "L(\007*\tX1\017";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = "\001\000$\013]";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                obj = "L(\007*\tX1\017";
                byte0 = 78;
                i1 = 79;
                break;

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "S \035\020\036N/\036.\036U\036\003+";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "~(\016";
                byte0 = 80;
                break;

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "E \036.L\024";
                byte0 = 81;
                break;

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "S \035\020\036N/\036.\036U\036\003+]\034a";
                byte0 = 82;
                break;

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "J$\023";
                byte0 = 83;
                break;

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                i1 = 85;
                obj = "K(\016";
                byte0 = 84;
                break;

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "@-\032'\034";
                byte0 = 85;
                break;

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = "L$\016&\034W(\0178R@4\016&\022\001%\037=\034U(\005!G";
                byte0 = 86;
                break;

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "L$\016&\034W(\0178RQ3\017?\034S$\013:\031H.\032#\034X#\013,\026\016";
                byte0 = 87;
                break;

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "I \031\020\034O(\007.\tH.\004";
                byte0 = 88;
                break;

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "J$\023";
                byte0 = 89;
                break;

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                i1 = 91;
                obj = "V(\016;\025";
                byte0 = 90;
                break;

            case 90: // 'Z'
                as1[i1] = ((String) (obj));
                i1 = 92;
                obj = "I$\003(\025U";
                byte0 = 91;
                break;

            case 91: // '['
                as1[i1] = ((String) (obj));
                i1 = 93;
                obj = "K(\016";
                byte0 = 92;
                break;

            case 92: // '\\'
                as1[i1] = ((String) (obj));
                N = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 2148
    //                   0 2171
    //                   1 2178
    //                   2 2185
    //                   3 2192;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2192;
_L3:
        byte byte1 = 125;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 65;
          goto _L9
_L6:
        byte1 = 106;
          goto _L9
        byte1 = 79;
          goto _L9
    }

    private class MediaViewPager extends PhotoViewPager
    {

        final MediaView g;

        public MediaViewPager(Context context, AttributeSet attributeset)
        {
            g = MediaView.this;
            super(context, attributeset);
            setOnPageChangeListener(new a_0(this, MediaView.this));
            setOnInterceptTouchListener(new b_(this, MediaView.this));
        }
    }


    private class _cls15 extends PhotoView
    {

        final MediaView Q;

        public boolean b(float f1, float f2)
        {
            return super.b(f1, f2);
        }

        public boolean c(float f1, float f2)
        {
            return super.c(f1, f2);
        }

        public boolean onDoubleTap(MotionEvent motionevent)
        {
            MediaView mediaview = Q;
            boolean flag;
            if (g() != h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MediaView.b(mediaview, flag);
            return super.onDoubleTap(motionevent);
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            MediaView.b(Q, false);
            return super.onScaleBegin(scalegesturedetector);
        }

        public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
        {
            super.onScaleEnd(scalegesturedetector);
            scalegesturedetector = Q;
            boolean flag;
            if (g() == h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MediaView.b(scalegesturedetector, flag);
        }

        _cls15(Context context)
        {
            Q = MediaView.this;
            super(context);
        }
    }

}
