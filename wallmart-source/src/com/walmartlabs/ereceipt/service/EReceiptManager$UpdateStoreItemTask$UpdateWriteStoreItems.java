// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

private class this._cls1 extends this._cls1
{

    final this._cls1 this$1;

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        onPostExecute(this._cls1.this, true);
        if (!_mth1())
        {
            EReceiptManager.access$1902(_fld1, new this._cls1(_fld1, (String[])ArrayUtils.addAll(this._mth1(this._cls1.this), this._mth1(this._cls1.this)), null));
            EReceiptManager.access$1900(_fld1)._mth1(new Void[0]);
        }
    }

    public (Set set)
    {
        this$1 = this._cls1.this;
        super(_fld1, set);
    }
}
