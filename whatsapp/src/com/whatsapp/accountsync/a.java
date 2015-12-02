// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.os.AsyncTask;
import com.whatsapp.mk;

// Referenced classes of package com.whatsapp.accountsync:
//            PerformSyncManager, ProfileActivity

public class a extends AsyncTask
{

    final ProfileActivity a;

    public a(ProfileActivity profileactivity)
    {
        a = profileactivity;
        super();
    }

    protected Void a(Void avoid[])
    {
        int i;
        int k;
        k = PerformSyncManager.a;
        i = 0;
_L1:
        int j;
        boolean flag;
        try
        {
            flag = mk.f;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        j = i;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i >= 45000)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i + 200;
        Thread.sleep(200L);
        i = j;
          goto _L1
        avoid;
        avoid.printStackTrace();
        i = j;
        if (k == 0) goto _L1; else goto _L2
_L2:
        if (j >= 45000)
        {
            try
            {
                if (mk.f)
                {
                    mk.h();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        return null;
    }

    protected void a(Void void1)
    {
        a.removeDialog(104);
        ProfileActivity.a(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        if (!a.isFinishing())
        {
            a.showDialog(104);
        }
    }
}
