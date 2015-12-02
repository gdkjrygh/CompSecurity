// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.VerifyMessageStoreActivity;
import com.whatsapp.aoz;
import com.whatsapp.asw;
import com.whatsapp.k;
import com.whatsapp.mk;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

// Referenced classes of package com.whatsapp.accountsync:
//            PerformSyncManager, a

public class ProfileActivity extends VerifyMessageStoreActivity
{

    private static final String z[];
    a k;

    public ProfileActivity()
    {
        k = null;
    }

    private void a()
    {
label0:
        {
label1:
            {
                int i;
label2:
                {
                    Cursor cursor;
label3:
                    {
label4:
                        {
                            i = PerformSyncManager.a;
                            if (getIntent().getData() == null)
                            {
                                break label1;
                            }
                            cursor = managedQuery(getIntent().getData(), null, null, null, null);
                            if (cursor == null)
                            {
                                break label2;
                            }
                            if (!cursor.moveToNext())
                            {
                                break label3;
                            }
                            Object obj = cursor.getString(cursor.getColumnIndex(z[6]));
                            obj = App.az.e(((String) (obj)));
                            if (obj != null)
                            {
                                if (isFinishing())
                                {
                                    break label4;
                                }
                                startActivity(Conversation.a(((com.whatsapp.og) (obj))));
                                if (i == 0)
                                {
                                    break label4;
                                }
                            }
                            if (!isFinishing())
                            {
                                startActivity(new Intent(this, Main.g()));
                            }
                        }
                        finish();
                    }
                    cursor.close();
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.e(z[5]);
            finish();
        }
    }

    static void a(ProfileActivity profileactivity)
    {
        profileactivity.a();
    }

    protected void b()
    {
label0:
        {
            if (mk.f)
            {
                if (k != null && k.getStatus() == android.os.AsyncTask.Status.RUNNING)
                {
                    break label0;
                }
                k = new a(this);
                asw.a(k, new Void[0]);
                if (PerformSyncManager.a == 0)
                {
                    break label0;
                }
            }
            a();
        }
    }

    public void onCreate(Bundle bundle)
    {
        int i;
        i = PerformSyncManager.a;
        super.onCreate(bundle);
        Log.i(z[0]);
        if (WhatsAppLibLoader.a(null)) goto _L2; else goto _L1
_L1:
        Log.i(z[3]);
        finish();
_L4:
        return;
_L2:
        if (App.Z == null || App.f(this) != 3)
        {
            App.b(this, 0x7f0e0191, 1);
            finish();
            return;
        }
        if (App.ah.y())
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = Environment.getExternalStorageState();
        if (!bundle.equals(z[4]) && !bundle.equals(z[1]))
        {
            showDialog(107);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        int j = App.ah.v();
        Log.i((new StringBuilder()).append(z[2]).append(j).toString());
        if (j > 0)
        {
            showDialog(105);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        b(false);
        if (i == 0) goto _L4; else goto _L3
_L3:
        b();
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "{G\027@EgP\031EXbC\021RU$V\nCM\177P";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "fZ\rHXnQ'TC";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "{G\027@EgP\031EXbC\021RU$V\nCM\177PWDMh^\rVJbY\035UJd@\026B\f";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "jW\027TXb[\037\006H~PXRC+[\031RE}PXJEiG\031TEnFXKExF\021HK";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "fZ\rHXnQ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "XL\026EIo\025\033IB\177T\033R\013x\025\022OH+X\021U_b[\037\031";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "Ot,g\035";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 44;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 11;
          goto _L9
_L5:
        byte1 = 53;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
