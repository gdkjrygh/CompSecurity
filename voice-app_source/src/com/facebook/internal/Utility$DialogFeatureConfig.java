// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility

public static class featureVersionSpec
{

    private String dialogName;
    private Uri fallbackUrl;
    private String featureName;
    private int featureVersionSpec[];

    private static featureVersionSpec parseDialogConfig(JSONObject jsonobject)
    {
        String s = jsonobject.optString("name");
        String as[];
        if (!Utility.isNullOrEmpty(s))
        {
            if ((as = s.split("\\|")).length == 2)
            {
                String s1 = as[0];
                String s2 = as[1];
                if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
                {
                    String s3 = jsonobject.optString("url");
                    Uri uri = null;
                    if (!Utility.isNullOrEmpty(s3))
                    {
                        uri = Uri.parse(s3);
                    }
                    return new <init>(s1, s2, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
                }
            }
        }
        return null;
    }

    private static int[] parseVersionSpec(JSONArray jsonarray)
    {
        int ai[] = null;
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        l = jsonarray.length();
        ai = new int[l];
        j = 0;
_L5:
        if (j < l) goto _L3; else goto _L2
_L2:
        return ai;
_L3:
        int k = jsonarray.optInt(j, -1);
        int i = k;
        if (k == -1)
        {
            String s = jsonarray.optString(j);
            i = k;
            if (!Utility.isNullOrEmpty(s))
            {
                try
                {
                    i = Integer.parseInt(s);
                }
                catch (NumberFormatException numberformatexception)
                {
                    Utility.logd("FacebookSDK", numberformatexception);
                    i = -1;
                }
            }
        }
        ai[j] = i;
        j++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String getDialogName()
    {
        return dialogName;
    }

    public Uri getFallbackUrl()
    {
        return fallbackUrl;
    }

    public String getFeatureName()
    {
        return featureName;
    }

    public int[] getVersionSpec()
    {
        return featureVersionSpec;
    }


    private (String s, String s1, Uri uri, int ai[])
    {
        dialogName = s;
        featureName = s1;
        fallbackUrl = uri;
        featureVersionSpec = ai;
    }
}
