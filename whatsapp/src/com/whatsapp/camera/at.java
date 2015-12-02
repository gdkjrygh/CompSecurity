// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.ContactPicker;
import com.whatsapp.og;
import com.whatsapp.util.Log;
import com.whatsapp.util.aj;
import com.whatsapp.util.c1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.whatsapp.camera:
//            t, CameraActivity

class at extends AsyncTask
{

    private static final String z[];
    final boolean a;
    final t b;
    final File c;
    final byte d[];

    at(t t1, File file, byte abyte0[], boolean flag)
    {
        b = t1;
        c = file;
        d = abyte0;
        a = flag;
        super();
    }

    protected Boolean a(Void avoid[])
    {
        Object obj1;
        Boolean boolean1;
        obj1 = Boolean.TRUE;
        avoid = null;
        boolean1 = null;
        Object obj = new FileOutputStream(c);
        avoid = ((Void []) (obj));
        ((FileOutputStream) (obj)).write(d);
        avoid = ((Void []) (obj1));
        if (obj != null)
        {
            boolean flag;
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                avoid = Boolean.FALSE;
                Log.e((new StringBuilder()).append(z[5]).append(((IOException) (obj)).getMessage()).toString());
                continue; /* Loop/switch isn't completed */
            }
            avoid = ((Void []) (obj1));
        }
_L10:
        if (!avoid.booleanValue())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = CameraActivity.j(b.a);
        Object obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        IOException ioexception;
        try
        {
            flag = CameraActivity.w(b.a);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj1 = Uri.fromFile(c);
        obj = obj1;
        if (a)
        {
            obj = ((Uri) (obj1)).buildUpon().appendQueryParameter(z[7], "1").build();
        }
        c1.a(b.a, CameraActivity.j(b.a).a, ((Uri) (obj)));
        return avoid;
        obj2;
        obj = null;
_L8:
        avoid = ((Void []) (obj));
        boolean1 = Boolean.FALSE;
        avoid = ((Void []) (obj));
        Log.e((new StringBuilder()).append(z[6]).append(((FileNotFoundException) (obj2)).getMessage()).toString());
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                avoid = Boolean.FALSE;
                Log.e((new StringBuilder()).append(z[8]).append(((IOException) (obj)).getMessage()).toString());
                continue; /* Loop/switch isn't completed */
            }
            avoid = boolean1;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_492;
        obj2;
        obj = boolean1;
_L6:
        avoid = ((Void []) (obj));
        boolean1 = Boolean.FALSE;
        avoid = ((Void []) (obj));
        Log.e((new StringBuilder()).append(z[9]).append(((IOException) (obj2)).getMessage()).toString());
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                avoid = Boolean.FALSE;
                Log.e((new StringBuilder()).append(z[3]).append(ioexception.getMessage()).toString());
                continue; /* Loop/switch isn't completed */
            }
            avoid = boolean1;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_486;
        obj2;
        ioexception = avoid;
        avoid = ((Void []) (obj2));
_L4:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                obj2 = Boolean.FALSE;
                Log.e((new StringBuilder()).append(z[10]).append(ioexception.getMessage()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        throw avoid;
        avoid;
        throw avoid;
        avoid;
_L2:
        Log.e((new StringBuilder()).append(z[4]).append(avoid.toString()).toString());
        return Boolean.FALSE;
        avoid;
        continue; /* Loop/switch isn't completed */
        avoid;
        continue; /* Loop/switch isn't completed */
        avoid;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        ioexception = avoid;
        avoid = ((Void []) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
        avoid = boolean1;
        continue; /* Loop/switch isn't completed */
        avoid = boolean1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void a(Boolean boolean1)
    {
label0:
        {
            int i = CameraActivity.n;
            Object obj;
            boolean flag;
            try
            {
                b.a.findViewById(0x7f0b00f9).setVisibility(8);
                if (boolean1.booleanValue())
                {
                    break label0;
                }
                App.b(b.a, 0x7f0e0074, 1);
                b.a.finish();
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                throw boolean1;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_216;
            }
        }
        obj = Uri.fromFile(c);
        boolean1 = ((Boolean) (obj));
        if (a)
        {
            boolean1 = ((Uri) (obj)).buildUpon().appendQueryParameter(z[1], "1").build();
        }
        flag = CameraActivity.w(b.a);
        if (flag)
        {
            try
            {
                CameraActivity.a(b.a, boolean1);
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                throw boolean1;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_216;
            }
        }
        obj = CameraActivity.j(b.a);
        if (obj == null)
        {
            obj = new Intent(b.a.getBaseContext(), com/whatsapp/ContactPicker);
            ((Intent) (obj)).setType(z[2]);
            ((Intent) (obj)).putExtra(z[0], boolean1);
            b.a.startActivity(((Intent) (obj)));
        }
        c1.a(b.a, Uri.fromFile(c));
        b.a.finish();
        return;
        boolean1;
        throw boolean1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "\023g).U\033mc5T\006l#(\024\027q9.[\\Z\031\016\1773D";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\024e$,\027\032";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\033d,;_]#";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\021h 9H\023h.(S\004`9%\025RL?.U\000).0U\001`#;\032\024`!9\000R";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\021h 9H\023h.(S\004`9%\025\024h$0_\026)";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\021h 9H\023h.(S\004`9%\025RL?.U\000).0U\001`#;\032\024`!9\000R";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\021h 9H\023h.(S\004`9%\025RO$0_Rg\"(\032\024f82^H)";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\024e$,\027\032";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\021h 9H\023h.(S\004`9%\025RL?.U\000).0U\001`#;\032\024`!9\000R";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "\021h 9H\023h.(S\004`9%\025RL?.U\000),?Y\027z>5T\025)+5V\0273m";
                byte0 = 8;
                i = 9;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\021h 9H\023h.(S\004`9%\025RL?.U\000).0U\001`#;\032\024`!9\000R";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 58;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 114;
          goto _L9
_L5:
        byte1 = 9;
          goto _L9
_L6:
        byte1 = 77;
          goto _L9
        byte1 = 92;
          goto _L9
    }
}
