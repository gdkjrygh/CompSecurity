// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.Refill;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderDetailsPresenter, PharmacyResponse, PharmacyUtils

class this._cls0 extends AsyncCallbackOnThread
{

    final OrderDetailsPresenter this$0;

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        if (isPopped())
        {
            return;
        } else
        {
            OrderDetailsPresenter.access$302(OrderDetailsPresenter.this, false);
            OrderDetailsPresenter.access$400(OrderDetailsPresenter.this, 0x10004);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        Object obj1;
        Refill refill;
        if (isPopped())
        {
            return;
        }
        OrderDetailsPresenter.access$302(OrderDetailsPresenter.this, false);
        if (pharmacyresponse == null || pharmacyresponse.data == null)
        {
            break MISSING_BLOCK_LABEL_653;
        }
        refill = (Refill)pharmacyresponse.data;
        obj1 = null;
        pharmacyresponse = null;
        Object obj = OrderDetailsPresenter.access$500().parse(refill.fillDate);
        pharmacyresponse = ((PharmacyResponse) (obj));
        java.util.Date date = OrderDetailsPresenter.access$500().parse(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).xpDate);
        obj1 = date;
        pharmacyresponse = ((PharmacyResponse) (obj));
        obj = obj1;
_L1:
        if (!TextUtils.isEmpty(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).lStatus))
        {
            int i = PharmacyUtils.mapFillStatusToFlagResId(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this));
            int j = PharmacyUtils.mapFillStatusToStringResId(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this));
            ParseException parseexception;
            if (i != 0 && j != 0)
            {
                obj1 = (TextView)ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), s);
                ((TextView) (obj1)).setBackgroundResource(i);
                ((TextView) (obj1)).setText(j);
            } else
            {
                ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), nt).setVisibility(8);
            }
        } else
        {
            ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), nt).setVisibility(8);
        }
        ViewUtil.setText(nt, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), WordUtils.capitalizeFully(refill.dispensedDrugName));
        if (OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).lQuantity > 0)
        {
            obj1 = (TextView)ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), this._fld0);
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText(OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).getString(details_quantity, new Object[] {
                Integer.valueOf(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).lQuantity)
            }));
        }
        ViewUtil.setText(Fill.fillQuantity, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).getString(ber, new Object[] {
            Integer.valueOf(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).umber)
        }));
        if (!TextUtils.isEmpty(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).scriber))
        {
            ViewUtil.setText(Fill.prescriber, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), WordUtils.capitalizeFully(OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).scriber));
        }
        if (obj != null)
        {
            obj1 = (TextView)ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), ate);
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText(OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).getString(s_expires_title, new Object[] {
                OrderDetailsPresenter.access$800().format(((java.util.Date) (obj)))
            }));
        }
        if (pharmacyresponse != null)
        {
            ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), ).setVisibility(0);
            ViewUtil.setText(, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).getString(d_date, new Object[] {
                OrderDetailsPresenter.access$800().format(pharmacyresponse)
            }));
        }
        if (refill.fillCost > 0.0F)
        {
            ViewUtil.setText(cess._fld800, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).getString(details_price, new Object[] {
                Float.valueOf(refill.fillCost)
            }));
        }
        if (OrderDetailsPresenter.access$600(OrderDetailsPresenter.this).hip() && refill.shippingAddress != null)
        {
            ViewUtil.setText(ddress, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), WordUtils.capitalizeFully(refill.shippingName));
            ViewUtil.setText(ame, OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), refill.shippingAddress.etAddress());
            ViewUtil.findViewById(OrderDetailsPresenter.access$700(OrderDetailsPresenter.this), n_container).setVisibility(0);
        }
        OrderDetailsPresenter.access$900(OrderDetailsPresenter.this, true);
        return;
        parseexception;
        parseexception.printStackTrace();
        parseexception = ((ParseException) (obj1));
          goto _L1
        OrderDetailsPresenter.access$1000(OrderDetailsPresenter.this, 0x10004);
        return;
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    ddress(Handler handler)
    {
        this$0 = OrderDetailsPresenter.this;
        super(handler);
    }
}
