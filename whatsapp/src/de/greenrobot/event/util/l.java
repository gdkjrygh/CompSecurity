// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import de.greenrobot.event.g;

// Referenced classes of package de.greenrobot.event.util:
//            a, h, k

public class l
{

    public static Class a;
    public static int b;
    private static final String z[];

    public l()
    {
    }

    public static Dialog a(Context context, Bundle bundle, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        int i = a.b;
        context = new android.app.AlertDialog.Builder(context);
        boolean flag;
        try
        {
            context.setTitle(bundle.getString(z[2]));
            context.setMessage(bundle.getString(z[3]));
            if (b != 0)
            {
                context.setIcon(b);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        context.setPositiveButton(0x104000a, onclicklistener);
        context = context.create();
        if (i != 0)
        {
            boolean flag1;
            try
            {
                flag = g.n;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            g.n = flag1;
        }
        return context;
        context;
        throw context;
    }

    public static void a(DialogInterface dialoginterface, int i, Activity activity, Bundle bundle)
    {
        if (a != null)
        {
            try
            {
                dialoginterface = ((DialogInterface) (a.newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (DialogInterface dialoginterface)
            {
                throw new RuntimeException(z[1], dialoginterface);
            }
            de.greenrobot.event.util.h.g.a.a().a(dialoginterface);
        }
        if (!bundle.getBoolean(z[0], false) || activity == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        activity.finish();
        return;
        dialoginterface;
        throw dialoginterface;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "sTBO7rT\002Z*u^\030\006 aT\002\\'bBBM7e^\036L,v]\003OkqX\002A6\177n\rN1rC3L,v]\003O";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L8:
label0:
        {
            if (i1 > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "RG\tF17R\rF+xELJ 7R\003F6cC\031K1rU";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "sTBO7rT\002Z*u^\030\006 aT\002\\'bBBM7e^\036L,v]\003OkcX\030D ";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "sTBO7rT\002Z*u^\030\006 aT\002\\'bBBM7e^\036L,v]\003OkzT\037[$pT";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                b = 0;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 180
    //                   0 201
    //                   1 207
    //                   2 213
    //                   3 219;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_219;
_L3:
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 23;
          goto _L9
_L5:
        byte0 = 49;
          goto _L9
_L6:
        byte0 = 108;
          goto _L9
        byte0 = 40;
          goto _L9
    }
}
