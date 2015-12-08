// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.app.FragmentHelper;
import com.weather.util.config.ConfigException;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.ups.ui:
//            SaveDemographicsInfoTask

public class CableProviderSelectFragment extends Fragment
{

    private static final String TAG = "CableProviderFragment";
    private ArrayAdapter cableProviderAdapter;
    private Spinner cableProviderSpinner;
    private int textVersion;
    private String titleText;

    public CableProviderSelectFragment()
    {
        textVersion = 1;
        try
        {
            textVersion = ConfigurationManagers.getInstance().getFlagshipConfig().cableProviderSignupTextVersion;
            return;
        }
        catch (ConfigException configexception)
        {
            LogUtil.e("CableProviderFragment", LoggingMetaTags.TWC_UPS, configexception.toString(), new Object[] {
                configexception
            });
        }
    }

    private boolean cableProviderIsHeadline(String s)
    {
        return s.equals(getString(com.weather.commons.R.string.cable_provider_headline));
    }

    static void newInstance(FragmentManager fragmentmanager)
    {
        FragmentHelper.switchToNewFragment(fragmentmanager, new CableProviderSelectFragment());
    }

    private void saveDemographicsInfo(Demographics demographics)
    {
        ProgressDialog progressdialog = new ProgressDialog(getActivity());
        (new SaveDemographicsInfoTask(getActivity(), progressdialog)).execute(new Demographics[] {
            demographics
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i;
        int j;
        super.onCreateView(layoutinflater, viewgroup, bundle);
        titleText = getString(com.weather.commons.R.string.cable_provider_action_bar_title);
        layoutinflater = layoutinflater.inflate(com.weather.commons.R.layout.cable_provider_select_fragment, viewgroup, false);
        ((Button)layoutinflater.findViewById(com.weather.commons.R.id.done_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final CableProviderSelectFragment this$0;

            public void onClick(View view)
            {
                view = cableProviderSpinner.getSelectedItem().toString();
                if (!cableProviderIsHeadline(view))
                {
                    Demographics demographics = BasicDemographicsStorage.getInstance().getDemographics();
                    demographics.setCableProvider(view);
                    saveDemographicsInfo(demographics);
                }
                getActivity().finish();
            }

            
            {
                this$0 = CableProviderSelectFragment.this;
                super();
            }
        });
        i = com.weather.commons.R.string.cable_provider_prompt1_1;
        j = com.weather.commons.R.string.cable_provider_prompt1_2;
        textVersion;
        JVM INSTR tableswitch 2 3: default 88
    //                   2 215
    //                   3 228;
           goto _L1 _L2 _L3
_L1:
        ((TextView)layoutinflater.findViewById(com.weather.commons.R.id.cable_provider_prompt_text1)).setText(getString(i));
        ((TextView)layoutinflater.findViewById(com.weather.commons.R.id.cable_provider_prompt_text2)).setText(getString(j));
        cableProviderSpinner = (Spinner)layoutinflater.findViewById(com.weather.commons.R.id.ups_cable_provider);
        cableProviderAdapter = ArrayAdapter.createFromResource(getActivity(), com.weather.commons.R.array.cable_provider_options, com.weather.commons.R.layout.ups_spinner_item);
        cableProviderAdapter.setDropDownViewResource(0x1090009);
        cableProviderSpinner.setAdapter(cableProviderAdapter);
        cableProviderSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final CableProviderSelectFragment this$0;

            public void onItemSelected(AdapterView adapterview, View view, int k, long l)
            {
                adapterview = (TextView)adapterview.getChildAt(0);
                if (adapterview != null)
                {
                    view = adapterview.getText().toString();
                    if (cableProviderIsHeadline(view))
                    {
                        adapterview.setTextColor(getResources().getColor(com.weather.commons.R.color.ups_spinner_text_color));
                    }
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = CableProviderSelectFragment.this;
                super();
            }
        });
        ((TextView)layoutinflater.findViewById(com.weather.commons.R.id.cable_provider_skip)).setOnClickListener(new android.view.View.OnClickListener() {

            final CableProviderSelectFragment this$0;

            public void onClick(View view)
            {
                getActivity().finish();
            }

            
            {
                this$0 = CableProviderSelectFragment.this;
                super();
            }
        });
        return layoutinflater;
_L2:
        i = com.weather.commons.R.string.cable_provider_prompt2_1;
        j = com.weather.commons.R.string.cable_provider_prompt2_2;
        continue; /* Loop/switch isn't completed */
_L3:
        i = com.weather.commons.R.string.cable_provider_prompt3_1;
        j = com.weather.commons.R.string.cable_provider_prompt3_2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = getActivity().getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(titleText);
        }
    }



}
