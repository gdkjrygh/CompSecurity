// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.os.AsyncTask;
import android.util.Log;
import com.google.common.base.Joiner;
import com.weather.commons.ups.backend.location.AddressValidationRequest;
import com.weather.commons.ups.backend.location.LocationStartSyncService;
import com.weather.commons.ups.backend.location.MapPointAddress;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController

private class <init> extends AsyncTask
{

    final AddressController this$0;

    private List validateAddress(String s)
    {
        return AddressValidationRequest.getInstance().syncFetch(s);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected transient Void doInBackground(doInBackground adoinbackground[])
    {
        int j;
        LocationStartSyncService.suppressSync();
        j = adoinbackground.length;
        int i = 0;
_L12:
        Object obj1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        obj1 = adoinbackground[i];
        Object obj;
        String s2;
        obj = cess._mth1800(((cess._cls1800) (obj1)));
        s2 = cess._mth1000(((cess._cls1000) (obj1)));
        obj = validateAddress(((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        if (((List) (obj)).isEmpty() || s2 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        MapPointAddress mappointaddress = (MapPointAddress)((List) (obj)).get(0);
        if (!mappointaddress.getAddr().equals("null")) goto _L2; else goto _L1
_L1:
        obj = null;
_L7:
        if (!mappointaddress.getCity().equals("null")) goto _L4; else goto _L3
_L3:
        obj1 = null;
_L8:
        if (!mappointaddress.getState().equals("null")) goto _L6; else goto _L5
_L5:
        String s = null;
_L9:
        if (!mappointaddress.getZip().equals("null"))
        {
            break MISSING_BLOCK_LABEL_219;
        }
        String s1 = null;
_L10:
        try
        {
            obj = Joiner.on(',').skipNulls().join(Arrays.asList(new String[] {
                obj, obj1, s, s1
            }));
            AddressController.access$1900(AddressController.this, mappointaddress.getLat(), mappointaddress.getLng(), ((String) (obj)), s2);
            break MISSING_BLOCK_LABEL_243;
        }
        // Misplaced declaration of an exception variable
        catch (doInBackground adoinbackground[])
        {
            Log.e("AddressController", adoinbackground.getMessage(), adoinbackground);
        }
        break MISSING_BLOCK_LABEL_241;
_L2:
        obj = mappointaddress.getAddr();
          goto _L7
_L4:
        obj1 = mappointaddress.getCity();
          goto _L8
_L6:
        s = mappointaddress.getState();
          goto _L9
        s1 = mappointaddress.getZip();
          goto _L10
        return null;
        i++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private vice()
    {
        this$0 = AddressController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
