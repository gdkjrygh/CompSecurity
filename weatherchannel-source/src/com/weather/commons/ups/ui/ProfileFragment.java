// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.common.collect.ImmutableMap;
import com.weather.util.date.Day;
import com.weather.util.device.LocaleUtil;
import com.weather.util.ui.ValueAdapterSupport;
import java.io.Serializable;

// Referenced classes of package com.weather.commons.ups.ui:
//            TwcDatePickerDialogListener, DatePickerDialogFragment

public abstract class ProfileFragment extends Fragment
    implements TwcDatePickerDialogListener, android.view.View.OnClickListener
{

    protected static final String GENDER_KEY = "GenderString";
    protected TextView birthDate;
    protected Day dateOfBirth;
    protected ValueAdapterSupport genderAdapterSupport;
    protected Spinner genderSpinner;
    private boolean isDatePickerOkayClicked;
    protected final int layoutId;
    protected int userAge;

    protected ProfileFragment(int i)
    {
        layoutId = i;
    }

    private Day dayConverter(String s, String s1, String s2)
    {
        return new Day(Integer.parseInt(s), Integer.parseInt(s1) - 1, Integer.parseInt(s2));
    }

    public void dialogDismissed(DialogFragment dialogfragment, boolean flag)
    {
        isDatePickerOkayClicked = flag;
    }

    protected boolean isSetDateValid(Day day)
    {
        return true;
    }

    public void onClick(View view)
    {
        if (view.getId() == com.weather.commons.R.id.ups_birthday)
        {
            android.app.FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
            Day day = dateOfBirth;
            view = day;
            if (day == null)
            {
                view = parseDateBasedOnDeviceLocale(birthDate.getText().toString());
                if (view == null)
                {
                    view = Day.now();
                }
            }
            (new DatePickerDialogFragment(this, getString(com.weather.commons.R.string.ups_sign_up_date_picker_title), view)).show(fragmenttransaction, "dialog");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (getActivity() == null)
        {
            return null;
        } else
        {
            layoutinflater = layoutinflater.inflate(layoutId, viewgroup, false);
            birthDate = (TextView)layoutinflater.findViewById(com.weather.commons.R.id.ups_birthday);
            birthDate.setOnClickListener(this);
            genderSpinner = (Spinner)layoutinflater.findViewById(com.weather.commons.R.id.ups_gender);
            genderSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final ProfileFragment this$0;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    adapterview = (TextView)adapterview.getChildAt(0);
                    if (adapterview != null && adapterview.getText().toString().equals(getString(com.weather.commons.R.string.gender_headline)))
                    {
                        adapterview.setTextColor(getResources().getColor(com.weather.commons.R.color.ups_spinner_text_color));
                    }
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
            });
            viewgroup = ImmutableMap.of(com.weather.dal2.ups.Demographics.Gender.GENDER_MALE, getString(com.weather.commons.R.string.gender_male), com.weather.dal2.ups.Demographics.Gender.GENDER_FEMALE, getString(com.weather.commons.R.string.gender_female));
            genderAdapterSupport = new ValueAdapterSupport(genderSpinner, viewgroup, getString(com.weather.commons.R.string.gender_headline), com.weather.commons.R.layout.ups_spinner_item);
            genderAdapterSupport.setDropDownViewResource(0x1090009);
            return layoutinflater;
        }
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        datepicker = new Day(i, j, k);
        if (isDatePickerOkayClicked && birthDate != null && isSetDateValid(datepicker))
        {
            setDateBasedOnDeviceLocale(j + 1, i, k);
            dateOfBirth = datepicker;
            userAge = dateOfBirth.getAge();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (genderAdapterSupport != null)
        {
            bundle.putSerializable("GenderString", (Serializable)genderAdapterSupport.getSelectedItem());
        }
    }

    protected Day parseDateBasedOnDeviceLocale(String s)
    {
label0:
        {
            Object obj = null;
            Day day = obj;
            if (s != null)
            {
                s = s.split("/");
                day = obj;
                if (s.length == 3)
                {
                    if (!LocaleUtil.isDeviceInUS())
                    {
                        break label0;
                    }
                    day = dayConverter(s[2], s[0], s[1]);
                }
            }
            return day;
        }
        return dayConverter(s[2], s[1], s[0]);
    }

    protected void setDateBasedOnDeviceLocale(int i, int j, int k)
    {
        birthDate.setTextColor(0xff000000);
        if (LocaleUtil.isDeviceInUS())
        {
            birthDate.setText(String.format("%d/%d/%d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(j)
            }));
            return;
        } else
        {
            birthDate.setText(String.format("%d/%d/%d", new Object[] {
                Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j)
            }));
            return;
        }
    }
}
