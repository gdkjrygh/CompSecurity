// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import com.whatsapp.wallpaper.ImageViewTouchBase;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity, wd, uh, App, 
//            og, a9g, k, qk, 
//            Main

public class ViewProfilePhoto extends DialogToastActivity
    implements wd
{

    private static final String z[];
    private og j;
    private Handler k;

    public ViewProfilePhoto()
    {
        k = new uh(this);
    }

    static og a(ViewProfilePhoto viewprofilephoto)
    {
        return viewprofilephoto.j;
    }

    private void b()
    {
        Object obj;
label0:
        {
            int i = App.am;
            Object obj2 = findViewById(0x7f0b0088);
            ImageViewTouchBase imageviewtouchbase = (ImageViewTouchBase)findViewById(0x7f0b015c);
            TextView textview = (TextView)findViewById(0x7f0b01b5);
            int l;
            boolean flag;
            try
            {
                if (!a9g.a(j.a))
                {
                    break label0;
                }
                ((View) (obj2)).setVisibility(0);
                imageviewtouchbase.setVisibility(8);
                textview.setVisibility(8);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_262;
            }
        }
        obj = j.a(true);
        l = j.u;
        if (l != -1 || obj != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        imageviewtouchbase.setVisibility(8);
        ((View) (obj2)).setVisibility(8);
        textview.setVisibility(0);
        flag = j.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        textview.setText(0x7f0e02a9);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        textview.setText(0x7f0e02b0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        imageviewtouchbase.setVisibility(0);
        textview.setVisibility(8);
        l = j.u;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        ((View) (obj2)).setVisibility(0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ((View) (obj2)).setVisibility(8);
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj)), null, new android.graphics.BitmapFactory.Options());
        if (j.u > 0)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        l = j.q;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        imageviewtouchbase.setMaxProperScale(10F);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        imageviewtouchbase.setMaxProperScale(3F);
        imageviewtouchbase.setImageBitmap(((android.graphics.Bitmap) (obj2)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        ((InputStream) (obj)).close();
        return;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        ioexception;
    }

    public void a()
    {
label0:
        {
            j = App.az.e(j.a);
            if (j.k())
            {
                getSupportActionBar().setTitle(0x7f0e01f0);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            getSupportActionBar().setTitle(com.whatsapp.util.c.b(j.a(this), this));
        }
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        j = App.az.e(j.a);
        if (s.equals(j.a))
        {
            Log.i((new StringBuilder()).append(z[17]).append(j.u).toString());
            s = Environment.getExternalStorageState();
            boolean flag;
            if (s.equals(z[18]) && !s.equals(z[19]))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k.removeMessages(0);
            if (flag && j.u == 0)
            {
                App.a(j.a, j.u, 1);
                k.sendEmptyMessageDelayed(0, 32000L);
            }
            b();
            invalidateOptionsMenu();
        }
    }

    protected void onActivityResult(int i, int l, Intent intent)
    {
        int i1 = App.am;
        i;
        JVM INSTR tableswitch 12 13: default 28
    //                   12 29
    //                   13 85;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (l != -1) goto _L1; else goto _L4
_L4:
        if (intent == null || !intent.getBooleanExtra(z[0], false))
        {
            break; /* Loop/switch isn't completed */
        }
        qk.a(j, this);
        finish();
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        qk.a(intent, j, this, 13, this);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        com.whatsapp.qk.c().delete();
        if (l != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!qk.b(j, this)) goto _L1; else goto _L6
_L6:
        b();
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        if (l != 0 || intent == null) goto _L1; else goto _L8
_L8:
        qk.a(intent, this);
        return;
    }

    public void onCreate(Bundle bundle)
    {
        oh oh;
        int i;
label0:
        {
            i = App.am;
            super.onCreate(bundle);
            Log.i(z[6]);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(0x7f0300ad);
            bundle = getIntent().getStringExtra(z[4]);
            j = App.az.e(bundle);
            Log.i((new StringBuilder()).append(z[1]).append(bundle).append(z[3]).append(j.u).toString());
            App.b(this);
            oh = App.az.f();
            if (oh == null)
            {
                Log.i(z[7]);
                App.q(z[8]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
            ActionBar actionbar = getSupportActionBar();
            actionbar.setDisplayHomeAsUpEnabled(true);
            if (j.k())
            {
                actionbar.setTitle(0x7f0e01f0);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (bundle.equals(((og) (oh)).a))
            {
                actionbar.setTitle(0x7f0e02f9);
                if (i == 0)
                {
                    break label0;
                }
            }
            actionbar.setTitle(com.whatsapp.util.c.b(j.a(this), this));
        }
label1:
        {
            if (bundle.equals(((og) (oh)).a))
            {
                if (j.u <= 0 || j.c().exists())
                {
                    break label1;
                }
                j.u = 0;
                App.a(j.a, j.u, 1);
                k.sendEmptyMessageDelayed(0, 32000L);
                if (i == 0)
                {
                    break label1;
                }
            }
            bundle = Environment.getExternalStorageState();
            boolean flag;
            if (bundle.equals(z[2]) && !bundle.equals(z[5]))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (j.u > 0 && !j.c().exists())
                {
                    j.u = 0;
                }
                App.a(j.a, j.u, 1);
                if (j.u == 0)
                {
                    k.sendEmptyMessageDelayed(0, 32000L);
                }
            }
        }
        b();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (j.k() || j.equals(App.az.f()))
        {
            menu.add(0, 0, 0, 0x7f0e0140).setIcon(0x7f020509).setShowAsAction(2);
        }
        menu.add(0, 1, 0, 0x7f0e03d1).setIcon(0x7f020519).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(z[20]);
        k.removeMessages(0);
        App.a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 244
    //                   0: 40
    //                   1: 55
    //                   16908332: 238;
           goto _L1 _L2 _L3 _L4
_L2:
        qk.a(j, this, 12);
        return true;
        menuitem;
        throw menuitem;
_L3:
        Intent intent = new Intent(z[14]);
        intent.setType(z[9]);
        if (j.equals(App.az.f()))
        {
            menuitem = App.m(z[16]);
            Intent intent1;
            try
            {
                c1.a(j.c(), menuitem);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                App.b(getApplicationContext(), 0x7f0e02d8, 1);
                return true;
            }
        } else
        {
            menuitem = j.c();
        }
        intent.putExtra(z[10], Uri.fromFile(menuitem));
        intent = Intent.createChooser(intent, null);
        intent1 = new Intent(z[11], null);
        intent1.putExtra(z[15], Uri.fromFile(menuitem));
        intent1.putExtra(z[13], j.a(this));
        intent.putExtra(z[12], new Intent[] {
            intent1
        });
        startActivity(intent);
        return true;
_L4:
        finish();
        return true;
_L1:
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(1).setVisible(j.c().exists());
        return super.onPrepareOptionsMenu(menu);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[21];
        obj = ",qi?\0276gB";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "3kS:\0027mP$\036 r^\"\006*-U?\027$vSm";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "(mC#\006 f";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "er^\"\006*]P8\036)]_)H";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "/kR";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "(mC#\006 fi?\035";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "3kS:\0027mP$\036 r^\"\006*-U?\027$vS";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "3kS:\0027mP$\036 r^\"\006*-U?\027$vSb\034*/[(";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "&mX;\0277qW9\033*lEm\020*wX.\027evYm\037$kX";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ",oW*\027j(";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "$lR?\035,f\030$\0341gX9\\ zB?\023kQb\0377\004O";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "&m[c\005-cB>\0235r\030$\0341gX9\\$aB$\035+,e\f$\000]f\005=\021M";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "$lR?\035,f\030$\0341gX9\\ zB?\023kKx\004&\fCz\022;\013Vs\003&\026";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "+c[(";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "$lR?\035,f\030$\0341gX9\\$aB$\035+,e\b<\001";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "$lR?\035,f\030$\0341gX9\\ zB?\023kQb\0377\004O";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "(g\030'\002\"";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "3kS:\0027mP$\036 r^\"\006*-Y#\0027mP$\036 r^\"\006*a^,\034\"gRm\002-mB\"-#wZ!-,f\f";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "(mC#\006 f";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "(mC#\006 fi?\035";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "3kS:\0027mP$\036 r^\"\006*-R(\0011pY4";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 544
    //                   0 567
    //                   1 574
    //                   2 580
    //                   3 587;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_587;
_L3:
        byte byte1 = 114;
_L9:
        obj[l] = (char)(byte1 ^ c2);
        l++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 2;
          goto _L9
_L6:
        byte1 = 54;
          goto _L9
        byte1 = 77;
          goto _L9
    }
}
