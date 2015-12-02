// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.ArrayMap;
import android.util.Base64;
import com.ubercab.android.partner.funnel.onboarding.documents.network.DocumentUploadApi;

public final class ctj
{

    private final DocumentUploadApi a;

    public ctj(DocumentUploadApi documentuploadapi)
    {
        a = documentuploadapi;
    }

    public final ica a(String s, int i, int j, ArrayMap arraymap, byte abyte0[])
    {
        ArrayMap arraymap1;
        arraymap1 = new ArrayMap();
        arraymap1.put("required_document_id", Integer.valueOf(i));
        arraymap1.put("expiration", "3000-01-01T00:00:00-00:00");
        arraymap1.put("picture_file_jpg", Base64.encodeToString(abyte0, 0));
        if (j != 0) goto _L2; else goto _L1
_L1:
        arraymap1.put("user_uuid", s);
_L4:
        if (arraymap != null)
        {
            arraymap1.put("meta", (new bjy()).c().a(arraymap));
        }
        return a.postDocument(arraymap1);
_L2:
        if (j == 1)
        {
            arraymap1.put("vehicle_uuid", s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
