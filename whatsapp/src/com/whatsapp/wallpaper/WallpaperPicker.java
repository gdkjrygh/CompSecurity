// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.whatsapp.CustomVelocityGallery;
import com.whatsapp.asw;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase, a, h, b, 
//            c, r, l, j, 
//            e

public class WallpaperPicker extends Activity
    implements android.widget.AdapterView.OnItemSelectedListener, android.view.View.OnClickListener
{

    private static final String z[];
    PackageManager a;
    private ImageView b;
    private ArrayList c;
    private Bitmap d;
    private a e;
    private ArrayList f;
    private e g;
    Resources h;
    private CustomVelocityGallery i;
    private boolean j;

    public WallpaperPicker()
    {
        c = new ArrayList(24);
        f = new ArrayList(24);
        j = false;
        h = null;
    }

    static Bitmap a(WallpaperPicker wallpaperpicker, Bitmap bitmap)
    {
        wallpaperpicker.d = bitmap;
        return bitmap;
    }

    static ImageView a(WallpaperPicker wallpaperpicker)
    {
        return wallpaperpicker.b;
    }

    static e a(WallpaperPicker wallpaperpicker, e e1)
    {
        wallpaperpicker.g = e1;
        return e1;
    }

    private void a()
    {
        a(h, z[11]);
    }

    private void a(int k)
    {
        Intent intent = new Intent();
        intent.putExtra(z[8], (Serializable)f.get(k));
        k = getIntent().getIntExtra(z[10], 1);
        intent.putExtra(z[9], k);
        setResult(-1, intent);
        finish();
    }

    private void a(Resources resources, String s)
    {
        boolean flag = ImageViewTouchBase.e;
        String as[];
        int i1;
        as = resources.getStringArray(0x7f050000);
        i1 = as.length;
        int k = 0;
_L2:
        String s1;
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[k];
        int j1 = resources.getIdentifier(s1, z[4], s);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        int k1 = resources.getIdentifier((new StringBuilder()).append(s1).append(z[5]).toString(), z[2], s);
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        c.add(Integer.valueOf(k1));
        f.add(Integer.valueOf(j1));
        k++;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (f.size() == 0)
        {
            showDialog(1);
            return;
        }
        break MISSING_BLOCK_LABEL_162;
        resources;
        try
        {
            throw resources;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            Log.e(z[3]);
            showDialog(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            showDialog(1);
        }
        break MISSING_BLOCK_LABEL_181;
        e.notifyDataSetChanged();
        j = true;
        return;
    }

    static ArrayList b(WallpaperPicker wallpaperpicker)
    {
        return wallpaperpicker.c;
    }

    static Bitmap c(WallpaperPicker wallpaperpicker)
    {
        return wallpaperpicker.d;
    }

    static ArrayList d(WallpaperPicker wallpaperpicker)
    {
        return wallpaperpicker.f;
    }

    public void onClick(View view)
    {
        boolean flag;
        try
        {
            flag = j;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                throw view;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                throw view;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        a(i.getSelectedItemPosition());
        if (!ImageViewTouchBase.e)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        finish();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        a = getPackageManager();
        setContentView(0x7f0300b2);
        i = (CustomVelocityGallery)findViewById(0x7f0b0271);
        i.setVelocityTransformer(new h(this));
        e = new a(this, this);
        i.setAdapter(e);
        i.setOnItemSelectedListener(this);
        i.setCallbackDuringFling(false);
        findViewById(0x7f0b02e4).setOnClickListener(this);
        b = (ImageView)findViewById(0x7f0b02e3);
        try
        {
            h = a.getResourcesForApplication(z[1]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e((new StringBuilder()).append(z[0]).append(bundle.toString()).toString());
        }
    }

    public Dialog onCreateDialog(int k)
    {
        k;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 123
    //                   2 26;
           goto _L1 _L2 _L3
_L1:
        return null;
_L3:
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L5; else goto _L4
_L4:
        Object obj = z[6];
_L6:
        return (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f0e049c)).setMessage(getString(0x7f0e0209)).setPositiveButton(getString(0x7f0e04b5), new b(this, ((String) (obj)))).setNegativeButton(getString(0x7f0e02a3), new c(this)).create();
        obj;
        throw obj;
_L5:
        obj = z[7];
          goto _L6
_L2:
        r r1 = new r(this);
        return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e013d).setPositiveButton(0x7f0e02ba, r1).setNegativeButton(0x7f0e007b, new l(this)).setOnCancelListener(new j(this)).create();
    }

    protected void onDestroy()
    {
        e e1;
        super.onDestroy();
        e1 = g;
        android.content.res.Resources.NotFoundException notfoundexception;
        if (e1 != null)
        {
            try
            {
                if (g.getStatus() != android.os.AsyncTask.Status.FINISHED)
                {
                    g.cancel(true);
                    g = null;
                    return;
                }
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception1)
            {
                throw notfoundexception1;
            }
        }
        break MISSING_BLOCK_LABEL_47;
        notfoundexception;
        throw notfoundexception;
    }

    public void onItemSelected(AdapterView adapterview, View view, int k, long l1)
    {
        adapterview = g;
        if (adapterview != null)
        {
            try
            {
                if (g.getStatus() != android.os.AsyncTask.Status.FINISHED)
                {
                    g.a();
                }
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                throw adapterview;
            }
        }
        g = new e(this);
        asw.a(g, new Integer[] {
            Integer.valueOf(k)
        });
        return;
        adapterview;
        throw adapterview;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    protected void onResume()
    {
        super.onResume();
        a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[12];
        obj = "\027\032]\0262\001\013T\b\035\020\022R\021'\022";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "\003\024\\T5\b\032E\t#\020\013\037\r#\f\027A\0332\005\t";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "\004\tP\r#\002\027T";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "\027\032]\0262\001\013T\bm\022\036B\0257\022\030T%,\017\017n\034-\025\025U";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "\004\tP\r#\002\027T";
                k = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "?\b\\\033.\f";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "\001\025U\b-\t\037\037\t'\024\017X\024%\023Ub?\0015)x.\033?(t.\026)5v)";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "\001\025U\b-\t\037\037\t'\024\017X\024%\023Up*\022,2r;\026)4\177%\021%/e3\f'(";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "\022\036U3&";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "\017\tX\037,\024\032E\023-\016";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "\017\tX\037,\024\032E\023-\016";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                k = 11;
                obj = "\003\024\\T5\b\032E\t#\020\013\037\r#\f\027A\0332\005\t";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 66;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 96;
          goto _L9
_L5:
        byte1 = 123;
          goto _L9
_L6:
        byte1 = 49;
          goto _L9
        byte1 = 122;
          goto _L9
    }
}
