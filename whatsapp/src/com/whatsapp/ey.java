// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.protocol.bd;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.whispersystems.a0;
import org.whispersystems.aa;
import org.whispersystems.bB;
import org.whispersystems.bD;
import org.whispersystems.c;
import org.whispersystems.i;

// Referenced classes of package com.whatsapp:
//            a3k

public final class ey
    implements bB
{

    private static final String z[];
    private final a3k a;

    ey(a3k a3k1)
    {
        a = a3k1;
    }

    private bD a()
    {
        Object obj;
label0:
        {
            obj = a.getWritableDatabase();
            String s = z[2];
            String s1 = z[0];
            String s2 = z[3];
            obj = ((SQLiteDatabase) (obj)).query(s, new String[] {
                s1
            }, null, null, null, null, s2, "1");
            try
            {
                if (((Cursor) (obj)).moveToNext())
                {
                    break label0;
                }
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return null;
        }
        byte abyte0[] = ((Cursor) (obj)).getBlob(0);
        ((Cursor) (obj)).close();
        try
        {
            obj = new bD(abyte0);
            Log.i(z[1]);
        }
        catch (IOException ioexception)
        {
            Log.a(z[4], ioexception);
            return null;
        }
        return ((bD) (obj));
    }

    public bD a(int j)
    {
        Object obj = a.getWritableDatabase();
        Object obj1 = z[5];
        String s = z[7];
        String s1 = z[9];
        obj = ((SQLiteDatabase) (obj)).query(((String) (obj1)), new String[] {
            s
        }, s1, new String[] {
            String.valueOf(j)
        }, null, null, null);
        try
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                ((Cursor) (obj)).close();
                throw new c((new StringBuilder()).append(z[11]).append(j).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            obj1 = new bD(((Cursor) (obj)).getBlob(0));
            ((Cursor) (obj)).close();
            Log.i((new StringBuilder()).append(z[6]).append(j).toString());
        }
        catch (IOException ioexception)
        {
            Log.a((new StringBuilder()).append(z[10]).append(j).toString(), ioexception);
            throw new c((new StringBuilder()).append(z[8]).append(j).toString());
        }
        return ((bD) (obj1));
    }

    public bd b()
    {
        Object obj = a();
        byte abyte0[] = ((bD) (obj)).b().a().a();
        byte abyte1[] = new byte[abyte0.length - 1];
        System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
        obj = new bd(aa.b(((bD) (obj)).c()), abyte1, ((bD) (obj)).a());
        Log.i(z[12]);
        return ((bd) (obj));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[13];
        obj = "nMN\037&x";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "}PB\034;hD\r\0021hZD\025\"yL\r\0345hM^\004toAJ\0361x\b]\0021wMTP&yKB\0020<[X\0237y[^\026!pDT";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "oAJ\0361xw]\0021wMT\003";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "hA@\025'hI@\000tXm~3";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "zID\0341x\bY\037tlI_\0031<\\E\025tpIY\025'h\b^\0313rMIP$nMF\025-<ZH\023;nL";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "oAJ\0361xw]\0021wMT\003";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "}PB\034;hD\r\034;}LH\024t}\b^\0313rMIP$nM\r\0331e\bZ\031 t\bD\024t";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "nMN\037&x";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "uF[\0218uL\r\000&yCH\ttnMN\037&x\bZ\031 t\bD\024t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "lZH\0331ewD\024t!\b\022";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "zID\0341x\bY\037tlI_\0031<[D\027:yL\r\000&y\bF\025-<ZH\023;nL\r\024!nAC\027tpGL\024tzG_P=x\b";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "rG\r\003={FH\024tlZH\0331e\bL\0065uDL\0228y\bZ\031 t\bD\024t";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "}PB\034;hD\r\034;}LH\024th@HP8}\\H\003 <[D\027:yL\r\000&y\bF\025-<NB\002toMC\024=rO";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 368
    //                   0 391
    //                   1 398
    //                   2 405
    //                   3 412;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_412;
_L3:
        byte byte1 = 84;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 28;
          goto _L9
_L5:
        byte1 = 40;
          goto _L9
_L6:
        byte1 = 45;
          goto _L9
        byte1 = 112;
          goto _L9
    }
}
