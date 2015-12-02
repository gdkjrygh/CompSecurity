// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.ax;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, jt, App, w3, 
//            iz, x5, f9, hb, 
//            a1g, ThumbnailButton, ds

public class DescribeProblemActivity extends DialogToastActivity
{

    private static final String z[];
    private ax j;
    private w3 k;
    private String l;
    private Uri m[];
    private jt n;
    private String o;
    private EditText p;

    public DescribeProblemActivity()
    {
        m = new Uri[3];
    }

    static EditText a(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.p;
    }

    private jt a()
    {
        if (n != null && n.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            n.cancel(false);
        }
        n = new jt(this);
        return n;
    }

    static jt a(DescribeProblemActivity describeproblemactivity, jt jt1)
    {
        describeproblemactivity.n = jt1;
        return jt1;
    }

    static w3 a(DescribeProblemActivity describeproblemactivity, w3 w3_1)
    {
        describeproblemactivity.k = w3_1;
        return w3_1;
    }

    private void a(int i, Uri uri)
    {
        ImageView imageview;
        int i1;
        i1 = App.am;
        m[i] = uri;
        imageview = (ImageView)(ImageView)((LinearLayout)findViewById(0x7f0b01ba)).getChildAt(i);
        if (uri == null) goto _L2; else goto _L1
_L1:
        InputStream inputstream = App.d.openInputStream(uri);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj)));
        inputstream.close();
        if (((android.graphics.BitmapFactory.Options) (obj)).outWidth <= 0)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        i = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = 1;
        i = getWindowManager().getDefaultDisplay().getWidth() / 3;
_L4:
        if (i >= ((android.graphics.BitmapFactory.Options) (obj)).outWidth)
        {
            break; /* Loop/switch isn't completed */
        }
        i *= 2;
        obj.inSampleSize = ((android.graphics.BitmapFactory.Options) (obj)).inSampleSize * 2;
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        inputstream = App.d.openInputStream(uri);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        obj.inDither = true;
        i = android.os.Build.VERSION.SDK_INT;
        if (i < 10)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj.inPreferQualityOverSpeed = true;
        obj = BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageview.setImageBitmap(((android.graphics.Bitmap) (obj)));
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        Log.e((new StringBuilder()).append(z[8]).append(uri).toString());
        a(0x7f0e015a);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        Log.e((new StringBuilder()).append(z[7]).append(uri).toString());
        a(0x7f0e015a);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        Log.e((new StringBuilder()).append(z[5]).append(uri).toString());
        a(0x7f0e0159);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        Log.e((new StringBuilder()).append(z[9]).append(uri).toString());
        a(0x7f0e015a);
_L7:
        if (i1 == 0) goto _L5; else goto _L2
_L2:
        imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        imageview.setImageResource(0x7f02051a);
_L5:
        return;
        IOException ioexception;
        ioexception;
        try
        {
            throw ioexception;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            Log.a((new StringBuilder()).append(z[6]).append(uri).toString(), ioexception);
        }
        a(0x7f0e015a);
        if (true) goto _L7; else goto _L6
_L6:
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        uri;
        throw uri;
    }

    static jt b(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.a();
    }

    private w3 b()
    {
        if (k != null && k.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            k.cancel(false);
        }
        k = new w3(this);
        return k;
    }

    static String c(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.o;
    }

    static Uri[] d(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.m;
    }

    static w3 e(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.b();
    }

    static ax f(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.j;
    }

    static String g(DescribeProblemActivity describeproblemactivity)
    {
        return describeproblemactivity.l;
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
label0:
        {
            int j1 = App.am;
            if (i1 != -1 || i < 1 || i >= 4)
            {
                break label0;
            }
            if (intent.getBooleanExtra(z[12], false))
            {
                a(i - 1, ((Uri) (null)));
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (intent.getData() != null)
            {
                a(i - 1, intent.getData());
                if (j1 == 0)
                {
                    break label0;
                }
            }
            a(0x7f0e015a);
        }
    }

    public void onCreate(Bundle bundle)
    {
        int k1;
label0:
        {
            k1 = App.am;
            Log.i(z[4]);
            super.onCreate(bundle);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            setContentView(0x7f03005f);
            p = (EditText)findViewById(0x7f0b01b7);
            iz.a(p);
            findViewById(0x7f0b01b8).setOnClickListener(new x5(this));
            Intent intent = getIntent();
            o = intent.getStringExtra(z[2]);
            l = intent.getStringExtra(z[0]);
            if (intent.getIntExtra(z[3], 0) == 1)
            {
                getSupportActionBar().setTitle(0x7f0e0130);
                if (k1 == 0)
                {
                    break label0;
                }
            }
            getSupportActionBar().setTitle(0x7f0e012f);
        }
        hb.a(this, getSupportActionBar(), getString(0x7f0e02a2), new f9(this));
        a1g.a((TextView)findViewById(0x7f0b01b9));
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f0b01ba);
        linearlayout.removeAllViews();
        int l1 = getResources().getDimensionPixelSize(0x7f0a0048);
        int j1 = l1 / 4;
        int i = j1;
        if (j1 == 0)
        {
            i = 1;
        }
        j1 = 0;
        do
        {
            if (j1 >= 3)
            {
                break;
            }
            _cls3 _lcls3 = new _cls3(this);
            _lcls3.b = true;
            _lcls3.setBorderSize(i);
            _lcls3.setBorderColor(getResources().getColor(0x7f090028));
            _lcls3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            _lcls3.setImageResource(0x7f02051a);
            _lcls3.setOnClickListener(new ds(this, j1));
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
            layoutparams.bottomMargin = l1;
            layoutparams.rightMargin = l1;
            layoutparams.topMargin = l1;
            layoutparams.leftMargin = l1;
            linearlayout.addView(_lcls3, layoutparams);
            j1++;
        } while (k1 == 0);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        int i1;
        bundle = bundle.getParcelableArray(z[1]);
        i1 = 0;
_L6:
        if (i1 >= bundle.length) goto _L2; else goto _L3
_L3:
        if (bundle[i1] != null)
        {
            a(i1, (Uri)bundle[i1]);
        }
        if (k1 == 0) goto _L4; else goto _L2
_L2:
        j = new ax();
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Dialog onCreateDialog(int i)
    {
        ProgressDialog progressdialog1;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e032c));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 2: // '\002'
            progressdialog1 = new ProgressDialog(this);
            break;
        }
        progressdialog1.setMessage(getString(0x7f0e036f));
        progressdialog1.setIndeterminate(true);
        progressdialog1.setCancelable(false);
        return progressdialog1;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (k != null)
        {
            k.cancel(false);
        }
        if (n != null)
        {
            n.cancel(false);
        }
        Log.i(z[13]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        Log.i(z[14]);
    }

    public void onResume()
    {
        super.onResume();
        Log.i(z[11]);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray(z[10], m);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "!R\033@#*\\\002\03552MX*11^\004\0076'm\004\0016.X\033/76T\000\007 ;\023\005\013&4X\004\035 #I\003\035";
        byte0 = -1;
        i = 0;
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
                as1[i] = ((String) (obj));
                obj = "1^\004\0131,N\036\001 1";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "!R\033@#*\\\002\03552MX*11^\004\0076'm\004\0016.X\033/76T\000\007 ;\023\020\034;/";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "!R\033@#*\\\002\03552MX*11^\004\0076'm\004\0016.X\033/76T\000\007 ;\023\002\027$'";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "&X\005\r$0R\024\0021/\022\025\0341#I\023";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "&X\005\r$0R\024A'!O\023\013:1U\031\032{,R\002C5,\020\037\0035%XV";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "&X\005\r$0R\024A'!O\023\013:1U\031\032{b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "&X\005\r$0R\024A'!O\023\013:1U\031\032{,R[\007:2H\002C'6O\023\0179b";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "&X\005\r$0R\024A'!O\023\013:1U\031\032{,R[\007:2H\002C'6O\023\0179b";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "&X\005\r$0R\024A'!O\023\013:1U\031\032{,R[\007:2H\002C'6O\023\0179b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "1^\004\0131,N\036\001 1";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "&X\005\r$0R\024A&'N\003\0031";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "+N)\03411X\002";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "&X\005\r$0R\024A0'N\002\034;;";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "&X\005\r$0R\024A$#H\005\013";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 84;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 66;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 118;
          goto _L9
        byte1 = 110;
          goto _L9
    }

    private class _cls3 extends ThumbnailButton
    {

        final DescribeProblemActivity k;

        public void onDraw(Canvas canvas)
        {
            if (!isSelected() && !isPressed())
            {
                canvas.drawColor(getResources().getColor(0x7f090026));
            }
            super.onDraw(canvas);
        }

        protected void onMeasure(int i, int i1)
        {
            super.onMeasure(i, i1);
            setMeasuredDimension(getMeasuredWidth(), (getMeasuredWidth() * 4) / 3);
        }

        _cls3(Context context)
        {
            k = DescribeProblemActivity.this;
            super(context);
        }
    }

}
