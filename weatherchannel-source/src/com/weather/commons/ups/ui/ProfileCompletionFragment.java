// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.google.ReverseGeoCodeConnection;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.device.LocaleUtil;
import com.weather.util.ui.ValueAdapterSupport;
import java.io.Serializable;

// Referenced classes of package com.weather.commons.ups.ui:
//            AddressController, SaveDemographicsInfoTask, AccountCreator

public class ProfileCompletionFragment extends Fragment
{
    private class GetDemographicsInfoTask extends AsyncTask
    {

        final AccountManager accountManager;
        final ProfileCompletionFragment this$0;

        private void selectAgeRange(String s)
        {
            s = com.weather.dal2.ups.Demographics.AgeRange.lookupRange(s);
            if (s != null)
            {
                ageRangeAdapterSupport.selectItem(s);
            }
        }

        private void setGender(String s)
        {
            com.weather.dal2.ups.Demographics.Gender agender[] = com.weather.dal2.ups.Demographics.Gender.values();
            int j = agender.length;
            int i = 0;
            do
            {
label0:
                {
                    if (i < j)
                    {
                        com.weather.dal2.ups.Demographics.Gender gender = agender[i];
                        if (!s.equals(gender.toString()))
                        {
                            break label0;
                        }
                        genderAdapterSupport.selectItem(gender);
                    }
                    return;
                }
                i++;
            } while (true);
        }

        protected transient Demographics doInBackground(Void avoid[])
        {
            avoid = null;
            Demographics demographics;
            try
            {
                demographics = accountManager.getDemographics();
            }
            catch (Exception exception)
            {
                Log.e("ProfileCompletionFragment", exception.getMessage());
                return avoid;
            }
            avoid = demographics;
            BasicDemographicsStorage.getInstance().write(demographics);
            return demographics;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Demographics demographics)
        {
            if (isVisible() && demographics != null)
            {
                String s = demographics.getUserName();
                String s1 = demographics.getAgeRange();
                demographics = demographics.getGender();
                if (s != null)
                {
                    username.setText(s);
                }
                if (demographics != null)
                {
                    setGender(demographics);
                }
                if (s1 != null)
                {
                    selectAgeRange(s1);
                }
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Demographics)obj);
        }

        private GetDemographicsInfoTask()
        {
            this$0 = ProfileCompletionFragment.this;
            super();
            accountManager = AccountManager.getInstance();
        }

    }


    private static final String ACCOUNT_KEY = "DsxAccount";
    private static final String AGE_KEY = "AgeString";
    private static final String GENDER_KEY = "GenderString";
    private static final String TAG = "ProfileCompletionFragment";
    private final AccountManager accountManager = AccountManager.getInstance();
    private AddressController addressController;
    private ValueAdapterSupport ageRangeAdapterSupport;
    private TextView ageRangeSpinnerErrorTextView;
    private Button doneButton;
    private DsxAccount dsxAccount;
    private ValueAdapterSupport genderAdapterSupport;
    private ProgressDialog progressDialog;
    private EditText username;

    public ProfileCompletionFragment()
    {
    }

    private void populateDemographicsInfo()
    {
        (new GetDemographicsInfoTask()).execute(new Void[0]);
    }

    private void saveAccountData()
    {
        if (validateInput())
        {
            Object obj = username.getText().toString();
            com.weather.dal2.ups.Demographics.Gender gender = (com.weather.dal2.ups.Demographics.Gender)genderAdapterSupport.getSelectedItem();
            obj = new Demographics(((String) (obj)), (com.weather.dal2.ups.Demographics.AgeRange)ageRangeAdapterSupport.getSelectedItem(), gender);
            addressController.saveAddresses();
            saveDemographicsInfo(((Demographics) (obj)));
        }
    }

    private void saveDemographicsInfo(Demographics demographics)
    {
        progressDialog = new ProgressDialog(getActivity());
        if (getArguments().getBoolean("edit_profile"))
        {
            (new SaveDemographicsInfoTask(getActivity(), progressDialog, username)).execute(new Demographics[] {
                demographics
            });
            return;
        } else
        {
            (new AccountCreator(getActivity(), progressDialog, dsxAccount, demographics, username)).linkDsxAccount();
            return;
        }
    }

    private boolean validateInput()
    {
        if (username.getText().toString().isEmpty())
        {
            username.setError(getString(com.weather.commons.R.string.username_cannot_be_empty_msg));
        } else
        {
            username.setError(null);
            com.weather.dal2.ups.Demographics.AgeRange agerange = (com.weather.dal2.ups.Demographics.AgeRange)ageRangeAdapterSupport.getSelectedItem();
            if (agerange == null)
            {
                ageRangeSpinnerErrorTextView.setError(getString(com.weather.commons.R.string.username_cannot_be_empty_msg));
                return false;
            }
            ageRangeSpinnerErrorTextView.setError(null);
            if (agerange == com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_UNDER || agerange == com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_13_TO_17 && !LocaleUtil.isDeviceInUS())
            {
                if (accountManager.getLoginStatus() == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT)
                {
                    (new com.weather.commons.ups.backend.UpsCommonUtil.DeleteAccountTask(getActivity(), true, null)).execute(new Void[0]);
                    return false;
                }
            } else
            {
                return addressController.validateInput();
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        dsxAccount = (DsxAccount)getArguments().get("DsxAccount");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getActivity() == null)
        {
            return null;
        }
        layoutinflater = (View)Preconditions.checkNotNull(layoutinflater.inflate(com.weather.commons.R.layout.ups_profile_completion_fragment, viewgroup, false));
        viewgroup = (TextView)layoutinflater.findViewById(com.weather.commons.R.id.tvAlmostDone);
        username = (EditText)layoutinflater.findViewById(com.weather.commons.R.id.etUserName1);
        genderAdapterSupport = new ValueAdapterSupport((Spinner)layoutinflater.findViewById(com.weather.commons.R.id.ups_gender), ImmutableMap.of(com.weather.dal2.ups.Demographics.Gender.GENDER_MALE, getString(com.weather.commons.R.string.gender_male), com.weather.dal2.ups.Demographics.Gender.GENDER_FEMALE, getString(com.weather.commons.R.string.gender_female)), getString(com.weather.commons.R.string.gender_headline), com.weather.commons.R.layout.ups_spinner_item);
        genderAdapterSupport.setDropDownViewResource(0x1090009);
        ImmutableMap immutablemap = ImmutableMap.builder().put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_UNDER, "under13").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_13_TO_17, "13-17").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_18_TO_24, "18-24").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_25_TO_34, "25-34").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_35_TO_44, "35-44").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_45_TO_54, "45-54").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_55_TO_64, "55-64").put(com.weather.dal2.ups.Demographics.AgeRange.AGE_RANGE_65_PLUS, getString(com.weather.commons.R.string.age_range_over_65)).build();
        ageRangeAdapterSupport = new ValueAdapterSupport((Spinner)layoutinflater.findViewById(com.weather.commons.R.id.spAgeRange), immutablemap, getString(com.weather.commons.R.string.age_range_headline), com.weather.commons.R.layout.ups_spinner_item);
        ageRangeAdapterSupport.setDropDownViewResource(0x1090009);
        doneButton = (Button)layoutinflater.findViewById(com.weather.commons.R.id.btDone);
        addressController = new AddressController(layoutinflater, new Handler(), new SavedLocationsSnapshot(), getArguments().getBoolean("edit_profile"), new ReverseGeoCodeConnection(), bundle);
        boolean flag;
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (getArguments().getBoolean("edit_profile"))
        {
            viewgroup.setVisibility(8);
            if (!flag)
            {
                populateDemographicsInfo();
            }
        }
        if (flag)
        {
            genderAdapterSupport.selectItem((com.weather.dal2.ups.Demographics.Gender)bundle.get("GenderString"));
            ageRangeAdapterSupport.selectItem((com.weather.dal2.ups.Demographics.AgeRange)bundle.get("AgeString"));
        }
        ageRangeSpinnerErrorTextView = (TextView)layoutinflater.findViewById(com.weather.commons.R.id.tvSpAgeRangeError);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.weather.commons.R.string.ups_title_signup);
        }
        if (progressDialog != null && progressDialog.isShowing())
        {
            progressDialog.dismiss();
        }
        progressDialog = null;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (genderAdapterSupport != null)
        {
            bundle.putSerializable("GenderString", (Serializable)genderAdapterSupport.getSelectedItem());
        }
        if (ageRangeAdapterSupport != null)
        {
            bundle.putSerializable("AgeString", (Serializable)ageRangeAdapterSupport.getSelectedItem());
        }
        if (addressController != null)
        {
            addressController.saveInstanceState(bundle);
        }
    }

    public void onStart()
    {
        super.onStart();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.weather.commons.R.string.ups_title_profile_completion);
        }
        doneButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProfileCompletionFragment this$0;

            public void onClick(View view)
            {
                saveAccountData();
            }

            
            {
                this$0 = ProfileCompletionFragment.this;
                super();
            }
        });
    }




}
