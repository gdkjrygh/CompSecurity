// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.a;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.webkit.WebView;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.p2pimport.P2PContact;
import com.wf.wellsfargomobile.p2pimport.P2PImportDetailActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.wf.wellsfargomobile.webview.a:
//            c, b

public class e extends c
{

    public e()
    {
    }

    private void a(P2PContact p2pcontact, boolean flag, BaseWebViewActivity basewebviewactivity)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("firstName", p2pcontact.a()));
        arraylist.add(new BasicNameValuePair("lastName", p2pcontact.b()));
        if (p2pcontact.c().length + p2pcontact.d().length == 0) goto _L2; else goto _L1
_L1:
        if (!p2pcontact.e().booleanValue()) goto _L4; else goto _L3
_L3:
        arraylist.add(new BasicNameValuePair("token", p2pcontact.c()[p2pcontact.f()]));
        arraylist.add(new BasicNameValuePair("tokenType", "Email"));
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        arraylist.add(new BasicNameValuePair("source", "ContactList"));
_L5:
        p2pcontact = new UrlEncodedFormEntity(arraylist);
        basewebviewactivity.webview.postUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/p2p/importRecipient.action").toString(), EntityUtils.toByteArray(p2pcontact));
        return;
_L4:
        try
        {
            arraylist.add(new BasicNameValuePair("token", p2pcontact.d()[p2pcontact.f()]));
            arraylist.add(new BasicNameValuePair("tokenType", "Mobile"));
        }
        // Misplaced declaration of an exception variable
        catch (P2PContact p2pcontact)
        {
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800f9), basewebviewactivity.getString(0x7f080097));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (P2PContact p2pcontact)
        {
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800f9), basewebviewactivity.getString(0x7f080097));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (P2PContact p2pcontact)
        {
            basewebviewactivity.returnWithError(basewebviewactivity.getString(0x7f0800f9), basewebviewactivity.getString(0x7f080097));
            return;
        }
          goto _L2
        arraylist.add(new BasicNameValuePair("source", "Details"));
          goto _L5
    }

    public int a()
    {
        return 40;
    }

    public b a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        b b1 = new b();
        i;
        JVM INSTR tableswitch 16 17: default 32
    //                   16 35
    //                   17 70;
           goto _L1 _L2 _L3
_L1:
        return b1;
_L2:
        b1.a(false);
        if (j == -1)
        {
            a(intent, basewebviewactivity);
            return b1;
        }
        if (j == 0)
        {
            basewebviewactivity.finishActivity(16);
            return b1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        b1.a(false);
        if (j == -1)
        {
            a(WFApp.W(), false, basewebviewactivity);
            return b1;
        }
        if (j == 0)
        {
            basewebviewactivity.finishActivity(17);
            return b1;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void a(Intent intent, BaseWebViewActivity basewebviewactivity)
    {
        String as[];
        Object obj2;
        Cursor cursor;
        intent = intent.getData();
        intent = basewebviewactivity.getContentResolver().query(intent, new String[] {
            "_id", "display_name"
        }, null, null, null);
        if (intent.getCount() == 0)
        {
            intent.close();
            return;
        }
        intent.moveToFirst();
        obj2 = intent.getString(0);
        intent.getString(1);
        intent.close();
        cursor = basewebviewactivity.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, "contact_id = ? AND in_visible_group = '1'", new String[] {
            obj2
        }, null);
        intent = null;
        as = null;
_L4:
        Object obj;
        Object obj1;
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_549;
            }
            obj = cursor.getString(cursor.getColumnIndex("data2"));
            obj1 = cursor.getString(cursor.getColumnIndex("data3"));
            int i;
            if (obj1 != null)
            {
                intent = ((Intent) (obj1));
                break MISSING_BLOCK_LABEL_160;
            }
            as = ((String []) (obj1));
            intent = ((Intent) (obj));
        } while (obj == null);
label0:
        {
            if (((String) (obj)).length() <= 1)
            {
                break label0;
            }
            intent = ((Intent) (obj1));
        }
          goto _L1
        as = ((String []) (obj1));
        intent = ((Intent) (obj));
        if (TextUtils.isDigitsOnly(((CharSequence) (obj))))
        {
            intent = null;
            as = ((String []) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L1:
        cursor.close();
        obj1 = basewebviewactivity.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
            "_id", "data1", "data2", "data3"
        }, "contact_id = ?", new String[] {
            obj2
        }, null);
        as = new String[((Cursor) (obj1)).getCount()];
        for (i = 0; ((Cursor) (obj1)).moveToNext(); i++)
        {
            as[i] = ((Cursor) (obj1)).getString(1);
        }

        ((Cursor) (obj1)).close();
        obj2 = basewebviewactivity.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, "contact_id = ?", new String[] {
            obj2
        }, null);
        String as1[] = new String[((Cursor) (obj2)).getCount()];
        for (int j = 0; ((Cursor) (obj2)).moveToNext(); j++)
        {
            as1[j] = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("data1"));
        }

        ((Cursor) (obj2)).close();
        obj2 = new P2PContact();
        ((P2PContact) (obj2)).a(((String) (obj)));
        ((P2PContact) (obj2)).b(intent);
        ((P2PContact) (obj2)).a(as1);
        ((P2PContact) (obj2)).b(as);
        ((P2PContact) (obj2)).a(as1.length);
        ((P2PContact) (obj2)).b(as.length);
        ((P2PContact) (obj2)).c(0);
        ((P2PContact) (obj2)).a(Boolean.valueOf(false));
        if (as1.length + as.length <= 1)
        {
            if (as1.length == 1)
            {
                ((P2PContact) (obj2)).a(Boolean.valueOf(true));
            } else
            {
                ((P2PContact) (obj2)).a(Boolean.valueOf(false));
            }
            WFApp.a(((P2PContact) (obj2)));
            a(((P2PContact) (obj2)), true, basewebviewactivity);
            return;
        } else
        {
            intent = new Intent(basewebviewactivity, com/wf/wellsfargomobile/p2pimport/P2PImportDetailActivity);
            intent.putExtra("com.wf.wellsfargomobile.p2pimport.contact", ((android.os.Parcelable) (obj2)));
            basewebviewactivity.startActivityForResult(intent, 17);
            return;
        }
        obj = intent;
        intent = as;
        if (true) goto _L1; else goto _L2
_L2:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int[] b()
    {
        return new int[0];
    }

    public int[] c()
    {
        return (new int[] {
            16, 17
        });
    }
}
