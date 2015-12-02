// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App, aoz, MediaData

public class x9 extends AbstractCursor
{

    private static final String c[];
    private static final String z[];
    private Cursor a;
    private String b;
    private int d;

    public x9(String s, Cursor cursor)
    {
        d = -1;
        a = cursor;
        b = s;
        moveToPosition(0);
    }

    private boolean b()
    {
        int i;
        int k;
        boolean flag;
        k = App.am;
        i = 0;
        flag = false;
_L6:
        int j;
        boolean flag1;
        j = i;
        flag1 = flag;
        if (!a.moveToPrevious())
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!d()) goto _L2; else goto _L1
_L1:
        if (k == 0) goto _L4; else goto _L3
_L3:
        flag1 = true;
_L2:
        j = i + 1;
        i = j;
        flag = flag1;
        if (k == 0) goto _L6; else goto _L5
_L5:
        if (j > 0)
        {
            Log.i((new StringBuilder()).append(z[0]).append(j).toString());
        }
        if (!flag1)
        {
            a.moveToPosition(-1);
            Log.i(z[1]);
        }
        return flag1;
_L4:
        flag1 = true;
        j = i;
        if (true) goto _L5; else goto _L7
_L7:
    }

    private boolean c()
    {
        int i = 0;
        int k = App.am;
        boolean flag = false;
        int j;
        boolean flag1;
        do
        {
            j = i;
            flag1 = flag;
            if (!a.moveToNext())
            {
                break;
            }
            flag1 = flag;
            if (d())
            {
                flag1 = true;
                flag = true;
                j = i;
                if (k == 0)
                {
                    break;
                }
                flag1 = flag;
            }
            j = i + 1;
            i = j;
            flag = flag1;
        } while (k == 0);
        if (j > 0)
        {
            Log.i((new StringBuilder()).append(z[3]).append(j).toString());
        }
        if (!flag1)
        {
            d = getPosition() + 1;
            a.moveToPosition(-1);
            Log.i((new StringBuilder()).append(z[2]).append(d).toString());
        }
        return flag1;
    }

    private boolean d()
    {
        c4 c4_1 = App.ah.a(a(), b);
        if (c4_1.B != null)
        {
            MediaData mediadata = (MediaData)c4_1.B;
            if ((c4_1.y.b || mediadata.transferred) && mediadata.file != null)
            {
                Uri uri = Uri.fromFile(mediadata.file);
                if ((new File(uri.getPath())).exists())
                {
                    return true;
                }
                uri.getPath();
            }
        }
        return false;
    }

    public Cursor a()
    {
        return a;
    }

    public void close()
    {
        super.close();
        a.close();
    }

    public String[] getColumnNames()
    {
        return c;
    }

    public int getCount()
    {
        int i;
label0:
        {
            if (d < 0)
            {
                i = a.getCount();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            i = d;
        }
        return i;
    }

    public double getDouble(int i)
    {
        return 0.0D;
    }

    public float getFloat(int i)
    {
        return 0.0F;
    }

    public int getInt(int i)
    {
        return 0;
    }

    public long getLong(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        default:
            return 0L;

        case 0: // '\0'
            return a().getLong(0);

        case 2: // '\002'
            return App.ah.a(a(), b).I;
        }
    }

    public short getShort(int i)
    {
        return 0;
    }

    public String getString(int i)
    {
        i;
        JVM INSTR tableswitch 0 4: default 36
    //                   0 39
    //                   1 53
    //                   2 105
    //                   3 132
    //                   4 135;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return "";
_L2:
        return Long.toString(a().getLong(0));
_L3:
        Object obj = App.ah.a(a(), b);
        if (obj == null) goto _L1; else goto _L7
_L7:
        obj = (MediaData)((c4) (obj)).B;
        if (obj != null && ((MediaData) (obj)).file != null)
        {
            return ((MediaData) (obj)).file.getAbsolutePath();
        }
        if (App.am == 0) goto _L1; else goto _L4
_L4:
        c4 c4_1 = App.ah.a(a(), b);
        if (c4_1 != null)
        {
            return Long.toString(c4_1.I);
        }
          goto _L1
_L5:
        return "";
_L6:
        return z[4];
    }

    public int getType(int i)
    {
        byte byte0 = 1;
        switch (i)
        {
        default:
            byte0 = 3;
            // fall through

        case 0: // '\0'
        case 2: // '\002'
            return byte0;

        case 1: // '\001'
            return 3;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 3;
        }
    }

    public boolean isNull(int i)
    {
        return false;
    }

    public boolean onMove(int i, int j)
    {
        int k = -1;
        int l = App.am;
        if (i > j * 2)
        {
            a.moveToPosition(-1);
            i = k;
        }
        do
        {
            k = i;
            if (j <= i)
            {
                break;
            }
            if (!c())
            {
                onChange(true);
                return false;
            }
            k = i + 1;
            i = k;
        } while (l == 0);
        do
        {
            if (j >= k)
            {
                break;
            }
            if (!b())
            {
                onChange(true);
                return false;
            }
            k--;
        } while (l == 0);
        return true;
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "&Lp\021\034(\\f\013\0229\006d\n\030=\006g\023\024;\t";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int k;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "&Lp\021\034(\\f\013\0229\006d\n\030=\006z\027\t-Fa\026\031";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "&Lp\021\034(\\f\013\0229\006z\035\005?\006f\035\034'J{\r\023?\t";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "&Lp\021\034(\\f\013\0229\006z\035\005?\006g\023\024;\t";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\"Du\037\030dCd\035\032";
                i = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                as = new String[5];
                i = 0;
                as1 = as;
                obj = "\024@p";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "\024Mu\f\034";
                byte0 = 5;
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "/H`\035\t*Bq\026";
                byte0 = 6;
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = "?@`\024\030";
                byte0 = 7;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                obj = "&@y\035\"?Pd\035";
                byte0 = 8;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_280;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 125;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 75;
          goto _L8
_L3:
        byte1 = 41;
          goto _L8
_L4:
        byte1 = 20;
          goto _L8
        byte1 = 120;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        c = as;
    }
}
