// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.data.PrescriptionInfo;
import com.walmartlabs.android.pharmacy.util.TestFairyUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.text.WordUtils;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacySession, PharmacyUtils

public class RefillsListAdapter extends BaseAdapter
{
    public static interface CallStoreListener
    {

        public abstract void callHomeDelivery();

        public abstract void callStore(int i);
    }

    private static final class ViewHolder
    {

        View callPharmacyButton;
        View card;
        TextView drugName;
        TextView expirationDate;
        TextView lastRefillDate;
        View lastRefillTitle;
        boolean lastRefilledByHomeDelivery;
        TextView numberOfRemainingRefills;
        TextView numberOfRemainingRefillsTitle;
        TextView prescriber;
        TextView refillView;
        TextView rxNumber;
        TextView sectionHeader;
        View spacer;
        View statusFlag;
        int storeNumber;

        private ViewHolder()
        {
        }

    }


    private static final String TAG = com/walmartlabs/android/pharmacy/RefillsListAdapter.getSimpleName();
    private static final SimpleDateFormat sFormattedDate;
    private static final DateFormat sRefillFormat;
    private CallStoreListener mCallStoreListener;
    private final boolean mCanMakeCalls = canMakeCalls();
    private final Context mContext;
    private final ArrayList mList = new ArrayList();
    private final PrescriptionInfo mPrescriptionKey = new PrescriptionInfo();
    private final SparseArray mSectionForStartPosition = new SparseArray();

    public RefillsListAdapter(Context context)
    {
        mContext = context;
        setupTestFairy();
    }

    private boolean canMakeCalls()
    {
        boolean flag1 = false;
        Object obj = new Intent("android.intent.action.DIAL");
        ((Intent) (obj)).setData(Uri.parse("tel:5551231234"));
        obj = mContext.getPackageManager().queryIntentActivities(((Intent) (obj)), 0);
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!((List) (obj)).isEmpty())
            {
                flag = true;
            }
        }
        return flag;
    }

    private void populateFields(View view, com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription, String s)
    {
        Object obj;
        ViewHolder viewholder;
        if (prescription == null)
        {
            return;
        }
        viewholder = (ViewHolder)view.getTag();
        viewholder.storeNumber = prescription.storeNumber;
        viewholder.lastRefilledByHomeDelivery = prescription.wasLastRefilledByHomeDelivery();
        Date date;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            viewholder.sectionHeader.setText(Html.fromHtml(s));
            viewholder.sectionHeader.setVisibility(0);
        } else
        {
            viewholder.sectionHeader.setVisibility(8);
        }
        view = null;
        obj = null;
        s = sRefillFormat.parse(prescription.lastRefillDate);
        view = s;
        date = sRefillFormat.parse(prescription.rxExpDate);
        view = date;
        obj = s;
        s = view;
_L1:
        int i;
        int j;
        if (obj != null)
        {
            viewholder.lastRefillDate.setText(sFormattedDate.format(((Date) (obj))));
            viewholder.lastRefillDate.setVisibility(0);
            viewholder.lastRefillTitle.setVisibility(0);
        } else
        {
            viewholder.lastRefillDate.setVisibility(8);
            viewholder.lastRefillTitle.setVisibility(8);
        }
        if (prescription.rxAutoRefillable)
        {
            viewholder.refillView.setVisibility(0);
            if (prescription.rxAutoRefillOn)
            {
                viewholder.refillView.setText(mContext.getString(R.string.pharmacy_refills_on_auto_refill));
            } else
            {
                viewholder.refillView.setVisibility(4);
            }
        } else
        {
            viewholder.refillView.setVisibility(4);
        }
        flag = prescription.canBeRefilled();
        view = viewholder.callPharmacyButton;
        if (mCanMakeCalls && !flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        obj = viewholder.drugName;
        if (!TextUtils.isEmpty(prescription.dispensedDrugName))
        {
            view = prescription.dispensedDrugName;
        } else
        {
            view = prescription.prescribedDrugName;
        }
        ((TextView) (obj)).setText(WordUtils.capitalizeFully(view));
        viewholder.rxNumber.setText(mContext.getString(R.string.pharmacy_rx_number, new Object[] {
            Integer.valueOf(prescription.rxNumber)
        }));
        viewholder.prescriber.setText(WordUtils.capitalizeFully(prescription.prescriber));
        viewholder.expirationDate.setText(mContext.getString(R.string.pharmacy_refills_expires_title, new Object[] {
            sFormattedDate.format(s)
        }));
        viewholder.numberOfRemainingRefills.setText(Integer.toString(prescription.numOfRemainingReFills));
        view = mContext.getResources();
        viewholder.numberOfRemainingRefillsTitle.setText(view.getQuantityString(R.plurals.pharmacy_my_prescription_refills_remaining, prescription.numOfRemainingReFills));
        mPrescriptionKey.rxNumber = prescription.rxNumber;
        mPrescriptionKey.storeNumber = prescription.storeNumber;
        if (prescription.hasPlacedOrders() || PharmacyManager.get().getSession().getPlacedOrders().contains(mPrescriptionKey))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view = viewholder.statusFlag;
        if (i != 0)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        view.setVisibility(j);
        view = viewholder.spacer;
        if (i != 0)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        if (flag)
        {
            PharmacyUtils.setBackgroundResource(viewholder.card, R.drawable.card_bg_selector);
            viewholder.drugName.setTextColor(mContext.getResources().getColorStateList(R.color.pharmacy_text_orange_selector));
            return;
        } else
        {
            PharmacyUtils.setBackgroundResource(viewholder.card, R.drawable.card_bg_gray);
            viewholder.drugName.setTextColor(mContext.getResources().getColor(R.color.text_gray));
            return;
        }
        s;
        Log.w(TAG, "Could not parse prescription dates", s);
        s = ((String) (obj));
        obj = view;
          goto _L1
    }

    private void setUpViewHolder(View view)
    {
        final ViewHolder viewHolder = new ViewHolder();
        viewHolder.sectionHeader = (TextView)ViewUtil.findViewById(view, R.id.refill_list_entry_header);
        viewHolder.lastRefillDate = (TextView)ViewUtil.findViewById(view, R.id.last_refilled);
        viewHolder.lastRefillTitle = ViewUtil.findViewById(view, R.id.last_refilled_title);
        viewHolder.refillView = (TextView)ViewUtil.findViewById(view, R.id.refill_auto_refill);
        viewHolder.drugName = (TextView)ViewUtil.findViewById(view, R.id.drug);
        viewHolder.rxNumber = (TextView)ViewUtil.findViewById(view, R.id.rxnbr);
        viewHolder.prescriber = (TextView)ViewUtil.findViewById(view, R.id.refill_prescriber);
        viewHolder.expirationDate = (TextView)ViewUtil.findViewById(view, R.id.refill_expiration_date);
        viewHolder.numberOfRemainingRefills = (TextView)ViewUtil.findViewById(view, R.id.nbr_of_refills_text);
        viewHolder.numberOfRemainingRefillsTitle = (TextView)ViewUtil.findViewById(view, R.id.nbr_of_refills_title);
        viewHolder.callPharmacyButton = ViewUtil.findViewById(view, R.id.phone_button);
        viewHolder.statusFlag = ViewUtil.findViewById(view, R.id.status);
        viewHolder.spacer = ViewUtil.findViewById(view, R.id.spacer);
        viewHolder.card = ViewUtil.findViewById(view, R.id.rx_card);
        viewHolder.callPharmacyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RefillsListAdapter this$0;
            final ViewHolder val$viewHolder;

            public void onClick(View view1)
            {
                if (mCallStoreListener != null)
                {
                    if (viewHolder.lastRefilledByHomeDelivery)
                    {
                        mCallStoreListener.callHomeDelivery();
                    } else
                    {
                        mCallStoreListener.callStore(viewHolder.storeNumber);
                    }
                }
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("callToRefillButton"));
            }

            
            {
                this$0 = RefillsListAdapter.this;
                viewHolder = viewholder;
                super();
            }
        });
        view.setTag(viewHolder);
    }

    private void setupTestFairy()
    {
        TestFairyUtils.hideView(R.id.drug);
        TestFairyUtils.hideView(R.id.rxnbr);
    }

    private void updateSections()
    {
        mSectionForStartPosition.clear();
        if (mList.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        String s2;
        String s3;
        int i;
        s1 = "";
        s2 = mContext.getString(R.string.pharmacy_my_prescription_online_refillable_title);
        s3 = mContext.getString(R.string.pharmacy_my_prescription_offline_refillable_title);
        i = 0;
_L6:
        if (i >= mList.size()) goto _L1; else goto _L3
_L3:
        com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription = (com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription)mList.get(i);
        if (!s1.equals("") || !prescription.canBeRefilled()) goto _L5; else goto _L4
_L4:
        String s;
        s = s2;
        mSectionForStartPosition.put(i, s);
_L9:
        i++;
        s1 = s;
          goto _L6
_L5:
        if (s1.equals("")) goto _L8; else goto _L7
_L7:
        s = s1;
        if (!s1.equals(s2)) goto _L9; else goto _L8
_L8:
        s = s1;
        if (!prescription.canBeRefilled())
        {
            s = s3;
            mSectionForStartPosition.put(i, s);
        }
          goto _L9
    }

    public int getCount()
    {
        return mList.size();
    }

    public Object getItem(int i)
    {
        return mList.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = ViewUtil.inflate(mContext, R.layout.pharmacy_refills_list_entry, viewgroup);
            setUpViewHolder(view);
        }
        viewgroup = (String)mSectionForStartPosition.get(i);
        populateFields(view, (com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription)mList.get(i), viewgroup);
        return view;
    }

    public void notifyDataSetChanged()
    {
        updateSections();
        super.notifyDataSetChanged();
    }

    public void setCallStoreListener(CallStoreListener callstorelistener)
    {
        mCallStoreListener = callstorelistener;
    }

    public void setItems(com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription aprescription[])
    {
        mList.clear();
        if (aprescription != null)
        {
            mList.addAll(Arrays.asList(aprescription));
            Collections.sort(mList, new Comparator() {

                final RefillsListAdapter this$0;

                private int compareDate(com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription, com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription1)
                {
                    int i;
                    try
                    {
                        prescription = RefillsListAdapter.sRefillFormat.parse(prescription.lastRefillDate);
                        i = RefillsListAdapter.sRefillFormat.parse(prescription1.lastRefillDate).compareTo(prescription);
                    }
                    // Misplaced declaration of an exception variable
                    catch (com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription)
                    {
                        Log.w(RefillsListAdapter.TAG, "Date format error in prescription.");
                        return 0;
                    }
                    return i;
                }

                public int compare(com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription, com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription1)
                {
                    if (prescription.canBeRefilled())
                    {
                        if (prescription1.canBeRefilled())
                        {
                            return compareDate(prescription, prescription1);
                        } else
                        {
                            return -1;
                        }
                    }
                    if (prescription1.canBeRefilled())
                    {
                        return 1;
                    } else
                    {
                        return compareDate(prescription, prescription1);
                    }
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription)obj, (com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription)obj1);
                }

            
            {
                this$0 = RefillsListAdapter.this;
                super();
            }
            });
        }
        notifyDataSetChanged();
    }

    static 
    {
        sRefillFormat = new SimpleDateFormat("MMddyyyy", Locale.US);
        sFormattedDate = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
    }



}
