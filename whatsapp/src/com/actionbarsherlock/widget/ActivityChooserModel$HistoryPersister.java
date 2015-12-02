// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView, ActivityChooserModel

final class <init>
    implements Runnable
{

    private static final String z[];
    final ActivityChooserModel this$0;

    public void run()
    {
        int i;
        boolean flag = SearchView.a;
        ArrayList arraylist;
        synchronized (ActivityChooserModel.access$500(ActivityChooserModel.this))
        {
            arraylist = new ArrayList(ActivityChooserModel.access$600(ActivityChooserModel.this));
        }
        XmlSerializer xmlserializer;
        <init> <init>1;
        int j;
        try
        {
            obj = ActivityChooserModel.access$400(ActivityChooserModel.this).openFileOutput(ActivityChooserModel.access$300(ActivityChooserModel.this), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append(z[9]).append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj)));
            return;
        }
        xmlserializer = Xml.newSerializer();
        xmlserializer.setOutput(((java.io.OutputStream) (obj)), null);
        xmlserializer.startDocument(z[4], Boolean.valueOf(true));
        xmlserializer.startTag(null, z[3]);
        j = arraylist.size();
        i = 0;
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        <init>1 = (z)arraylist.remove(0);
        xmlserializer.startTag(null, z[6]);
        xmlserializer.attribute(null, z[0], <init>1.activity.flattenToString());
        xmlserializer.attribute(null, z[2], String.valueOf(<init>1.time));
        xmlserializer.attribute(null, z[7], String.valueOf(<init>1.weight));
        xmlserializer.endTag(null, z[8]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        xmlserializer.endTag(null, z[5]);
        xmlserializer.endDocument();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        ((FileOutputStream) (obj)).close();
_L2:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append(z[1]).append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append(z[10]).append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L2; else goto _L3
_L3:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        Log.e(ActivityChooserModel.access$1100(), (new StringBuilder()).append(z[11]).append(ActivityChooserModel.access$300(ActivityChooserModel.this)).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L2; else goto _L4
_L4:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        throw obj1;
        ioexception;
        return;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "so\022\0269{x\037";
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
                obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "fe\013\032";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "ze\025\013 `e\005\036#?~\003\034 `h\025";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "GX Rw";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "ze\025\013 `e\005\036#?~\003\034 `h\025";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "ze\025\013 `e\005\036#?~\003\034 `h";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "ei\017\030'f";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "ze\025\013 `e\005\036#?~\003\034 `h";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "W~\024\020=2{\024\026;{b\001_'{\177\022\020={o\007\023o`i\005\r v,\000\026#w6F";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 79;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 18;
          goto _L9
_L5:
        byte1 = 12;
          goto _L9
_L6:
        byte1 = 102;
          goto _L9
        byte1 = 127;
          goto _L9
    }

    private ()
    {
        this$0 = ActivityChooserModel.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
