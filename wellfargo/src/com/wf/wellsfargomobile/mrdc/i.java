// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.util.Log;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.util.t;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            k, j, a, ImageModeType, 
//            e

public class i
{

    private final BaseWebViewActivity a;

    public i(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
    }

    static BaseWebViewActivity a(i l)
    {
        return l.a;
    }

    public void cancelCheckDeposit(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            a.runOnUiThread(new k(this));
            return;
        }
    }

    public void communicationError(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new android.app.AlertDialog.Builder(a);
            s.setMessage(a.getString(0x7f080055)).setCancelable(false).setPositiveButton(a.getString(0x7f0800b3), new j(this));
            s.create();
            return;
        }
    }

    public void enableMrdc(String s)
    {
        s = (JSONObject)(new JSONTokener(s)).nextValue();
        String s1 = s.getString("nonce");
        if (!a.validNonce(s1))
        {
            return;
        }
        try
        {
            WFApp.a(t.a(Boolean.parseBoolean(s.getString("customerEnabledMrcd"))));
            a.supportInvalidateOptionsMenu();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("JavaScrIntCheckDeposit", "enableMrdc() - invalid JSON data", s);
        }
        return;
    }

    public void enterCheckDepositFlow(String s)
    {
        if (a.validNonce(s));
    }

    public void submitDeposit(String s, String s1, String s2)
    {
        if (!a.validNonce(s))
        {
            Log.d("JavaScrIntCheckDeposit", "submitDeposit() - nonce not valid");
            return;
        } else
        {
            (new a(a, s1, s2)).a();
            return;
        }
    }

    public void takePicture(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            e.a(a, ImageModeType.FRONT);
            return;
        }
    }

    public void takePictureFront(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            e.a(a, ImageModeType.FRONT);
            return;
        }
    }

    public void takePictureRear(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            e.a(a, ImageModeType.REAR);
            return;
        }
    }

    public void viewPictureFront(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            e.b(a, ImageModeType.FRONT);
            return;
        }
    }

    public void viewPictureRear(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            e.b(a, ImageModeType.REAR);
            return;
        }
    }
}
