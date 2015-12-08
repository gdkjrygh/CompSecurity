// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Spinner;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.SearchUtil;
import com.weather.commons.ups.backend.location.AddressValidationRequest;
import com.weather.commons.ups.backend.location.LocationStartSyncService;
import com.weather.commons.ups.backend.location.MapPointAddress;
import com.weather.dal2.google.AddressList;
import com.weather.dal2.google.ReverseGeoCodeConnection;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FixedLocationsSnapshot;
import com.weather.dal2.locations.LocationConnection;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.ui.ValueAdapterSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class AddressController
{
    private class AddButtonListener
        implements android.view.View.OnClickListener
    {

        final AddressController this$0;

        public void onClick(View view)
        {
            view = addressRows.iterator();
            do
            {
                if (!view.hasNext())
                {
                    break;
                }
                AddressRow addressrow = (AddressRow)view.next();
                if (addressrow.isVisible())
                {
                    continue;
                }
                addressrow.setVisible(true);
                break;
            } while (true);
            firstRow.deleteBtn.setVisibility(0);
            if (lastRow.isVisible())
            {
                addAddressButton.setVisibility(8);
            }
        }

        private AddButtonListener()
        {
            this$0 = AddressController.this;
            super();
        }

    }

    private class AddressListReceiver
        implements Receiver
    {

        final AddressController this$0;

        public void onCompletion(AddressList addresslist, Void void1)
        {
            int i = 0;
            do
            {
label0:
                {
                    if (i < addresslist.getCount())
                    {
                        if (!addresslist.isAcceptableAddress(i))
                        {
                            break label0;
                        }
                        setAddress0IfEmpty(addresslist);
                    }
                    return;
                }
                i++;
            } while (true);
        }

        public volatile void onCompletion(Object obj, Object obj1)
        {
            onCompletion((AddressList)obj, (Void)obj1);
        }

        public volatile void onError(Throwable throwable, Object obj)
        {
            onError(throwable, (Void)obj);
        }

        public void onError(Throwable throwable, Void void1)
        {
        }

        private AddressListReceiver()
        {
            this$0 = AddressController.this;
            super();
        }

    }

    private static final class AddressRecord
    {

        private final String address;
        private final String tag;



        private AddressRecord(String s, String s1)
        {
            tag = s;
            address = s1;
        }

    }

    private static final class AddressRow
    {

        private final SearchView address;
        private final ValueAdapterSupport addressTypeAdapterSupport;
        private final View deleteBtn;
        private final View layout;
        private final Spinner spinner;

        AddressRecord getAddressRecord()
        {
            return new AddressRecord((String)addressTypeAdapterSupport.getSelectedItem(), (String)address.getTag());
        }

        public boolean isVisible()
        {
            return layout.getVisibility() == 0;
        }

        public void setFrom(AddressRow addressrow)
        {
            String s = addressrow.address.getQuery().toString();
            address.setQuery(s, true);
            address.setTag(s);
            addressrow = (String)addressrow.addressTypeAdapterSupport.getSelectedItem();
            if (addressrow != null)
            {
                addressTypeAdapterSupport.selectItem(addressrow);
            }
        }

        public void setVisible(boolean flag)
        {
            View view = layout;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
            if (!flag)
            {
                address.setQuery("", true);
                address.setTag(null);
                address.clearFocus();
            }
        }

        public boolean validateInput()
        {
            return !isVisible() || !address.getQuery().toString().isEmpty();
        }





        AddressRow(View view, Spinner spinner1, SearchView searchview, View view1, Map map)
        {
            layout = (View)Preconditions.checkNotNull(view);
            spinner = (Spinner)Preconditions.checkNotNull(spinner1);
            address = (SearchView)Preconditions.checkNotNull(searchview);
            deleteBtn = (View)Preconditions.checkNotNull(view1);
            addressTypeAdapterSupport = new ValueAdapterSupport(spinner1, map, null, com.weather.commons.R.layout.ups_spinner_item);
            addressTypeAdapterSupport.setDropDownViewResource(0x1090009);
        }
    }

    private class DeleteButtonListener
        implements android.view.View.OnClickListener
    {

        private final int rowIndex;
        final AddressController this$0;

        public void onClick(View view)
        {
            int i = rowIndex + 1;
            do
            {
                if (i >= addressRows.size())
                {
                    break;
                }
                view = (AddressRow)addressRows.get(i);
                AddressRow addressrow = (AddressRow)addressRows.get(i - 1);
                if (!view.isVisible())
                {
                    break;
                }
                addressrow.setFrom(view);
                moveCursorToStart(((AddressRow) (view)).address);
                i++;
            } while (true);
            ((AddressRow)addressRows.get(i - 1)).setVisible(false);
            checkAddressTypes();
            addAddressButton.setVisibility(0);
            if (!((AddressRow)addressRows.get(1)).isVisible())
            {
                firstRow.deleteBtn.setVisibility(8);
            }
        }

        private DeleteButtonListener(int i)
        {
            this$0 = AddressController.this;
            super();
            rowIndex = i;
        }

    }

    private class SaveAddressTask extends AsyncTask
    {

        final AddressController this$0;

        private List validateAddress(String s)
        {
            return AddressValidationRequest.getInstance().syncFetch(s);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((AddressRecord[])aobj);
        }

        protected transient Void doInBackground(AddressRecord aaddressrecord[])
        {
            int j;
            LocationStartSyncService.suppressSync();
            j = aaddressrecord.length;
            int i = 0;
_L12:
            Object obj1;
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_241;
            }
            obj1 = aaddressrecord[i];
            Object obj;
            String s2;
            obj = ((AddressRecord) (obj1)).address;
            s2 = ((AddressRecord) (obj1)).tag;
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
                addLocation(mappointaddress.getLat(), mappointaddress.getLng(), ((String) (obj)), s2);
                break MISSING_BLOCK_LABEL_243;
            }
            // Misplaced declaration of an exception variable
            catch (AddressRecord aaddressrecord[])
            {
                Log.e("AddressController", aaddressrecord.getMessage(), aaddressrecord);
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

        private SaveAddressTask()
        {
            this$0 = AddressController.this;
            super();
        }

    }


    static final String ADDRESS_1_VISIBLE_KEY = "AddressOneVisible";
    static final String ADDRESS_2_VISIBLE_KEY = "AddressTwoVisible";
    static final String ADDRESS_TYPE_0_KEY = "AddressTypeString";
    static final String ADDRESS_TYPE_1_KEY = "AddressTypeOneString";
    static final String ADDRESS_TYPE_2_KEY = "AddressTypeTwoString";
    private static final String TAG = "AddressController";
    private final View addAddressButton;
    private final List addressRows;
    private final Context context;
    private final AddressRow firstRow;
    private final Handler handler;
    private final AddressRow lastRow;

    AddressController(View view, final Handler row, SavedLocationsSnapshot savedlocationssnapshot, boolean flag, ReverseGeoCodeConnection reversegeocodeconnection, Bundle bundle)
    {
        handler = row;
        context = view.getContext();
        row = ImmutableMap.of("home", context.getString(com.weather.commons.R.string.address_type_home), "work", context.getString(com.weather.commons.R.string.address_type_work), "other", context.getString(com.weather.commons.R.string.address_type_other));
        addressRows = ImmutableList.of(new AddressRow(view.findViewById(com.weather.commons.R.id.address_row0), (Spinner)view.findViewById(com.weather.commons.R.id.spAddressType), (SearchView)view.findViewById(com.weather.commons.R.id.etAddress), view.findViewById(com.weather.commons.R.id.btDeleteAddress), row), new AddressRow(view.findViewById(com.weather.commons.R.id.address_row1), (Spinner)view.findViewById(com.weather.commons.R.id.spAddressType1), (SearchView)view.findViewById(com.weather.commons.R.id.etAddress1), view.findViewById(com.weather.commons.R.id.btDeleteAddress1), row), new AddressRow(view.findViewById(com.weather.commons.R.id.address_row2), (Spinner)view.findViewById(com.weather.commons.R.id.spAddressType2), (SearchView)view.findViewById(com.weather.commons.R.id.etAddress2), view.findViewById(com.weather.commons.R.id.btDeleteAddress2), row));
        firstRow = (AddressRow)addressRows.get(0);
        lastRow = (AddressRow)addressRows.get(addressRows.size() - 1);
        firstRow.deleteBtn.setVisibility(8);
        addAddressButton = view.findViewById(com.weather.commons.R.id.tvAddAddress);
        addAddressButton.setOnClickListener(new AddButtonListener());
        int i;
        if (bundle != null)
        {
            view = (AddressRow)addressRows.get(1);
            firstRow.addressTypeAdapterSupport.selectItem((String)bundle.get("AddressTypeString"));
            ((AddressRow) (view)).addressTypeAdapterSupport.selectItem((String)bundle.get("AddressTypeOneString"));
            view.setVisible(bundle.getBoolean("AddressOneVisible"));
            lastRow.addressTypeAdapterSupport.selectItem((String)bundle.get("AddressTypeTwoString"));
            lastRow.setVisible(bundle.getBoolean("AddressTwoVisible"));
        } else
        {
            populateAddress(savedlocationssnapshot, flag, reversegeocodeconnection);
        }
        checkAddressTypes();
        firstRow.spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AddressController this$0;

            public void onItemSelected(AdapterView adapterview, View view1, int j, long l)
            {
                checkAddressTypes();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = AddressController.this;
                super();
            }
        });
        ((AddressRow)addressRows.get(1)).spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AddressController this$0;

            public void onItemSelected(AdapterView adapterview, View view1, int j, long l)
            {
                handleRow1AddressTypeChange();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = AddressController.this;
                super();
            }
        });
        i = 0;
        for (view = addressRows.iterator(); view.hasNext();)
        {
            row = (AddressRow)view.next();
            ((AddressRow) (row)).deleteBtn.setOnClickListener(new DeleteButtonListener(i));
            ((AddressRow) (row)).address.setIconified(false);
            row = new SearchUtil(((AddressRow) (row)).address, new Receiver() {

                final AddressController this$0;
                final AddressRow val$row;

                public void onCompletion(SavedLocation savedlocation, String s)
                {
                    handler.post(s. new Runnable() {

                        final _cls3 this$1;
                        final String val$userData;

                        public void run()
                        {
                            row.address.setQuery(userData, false);
                            row.address.setTag(userData);
                            AddressRow addressrow;
                            for (Iterator iterator = addressRows.iterator(); iterator.hasNext(); moveCursorToStart(addressrow.address))
                            {
                                addressrow = (AddressRow)iterator.next();
                                addressrow.address.clearFocus();
                            }

                        }

            
            {
                this$1 = final__pcls3;
                userData = String.this;
                super();
            }
                    });
                }

                public volatile void onCompletion(Object obj, Object obj1)
                {
                    onCompletion((SavedLocation)obj, (String)obj1);
                }

                public volatile void onError(Throwable throwable, Object obj)
                {
                    onError(throwable, (String)obj);
                }

                public void onError(Throwable throwable, String s)
                {
                    ExceptionUtil.logExceptionError("AddressController", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
                }

            
            {
                this$0 = AddressController.this;
                row = addressrow;
                super();
            }
            });
            if (context instanceof Activity)
            {
                row.setupSearchView((Activity)context, 0xff000000);
            }
            i++;
        }

    }

    private void addLocation(String s, String s1, String s2, String s3)
    {
        double d = Double.valueOf(s).doubleValue();
        double d1 = Double.valueOf(s1).doubleValue();
        SavedLocation savedlocation;
        try
        {
            savedlocation = LocationConnection.getInstance().fetch(d, d1, false);
            if (FixedLocations.getInstance().addLocation(savedlocation))
            {
                LocationManager.getLocationManager().setCurrentLocation(savedlocation, "AddressController.addLocation", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED);
            }
            FixedLocations.getInstance().setAddress(savedlocation, s2);
            FixedLocations.getInstance().clearTags(savedlocation);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            Log.e("AddressController", (new StringBuilder()).append("unable to add location ").append(s).append(',').append(s1).toString());
            return;
        }
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        FixedLocations.getInstance().addTagToLocation(savedlocation, s3);
    }

    private void checkAddressTypes()
    {
        Object obj1 = ((AddressRow)addressRows.get(0)).addressTypeAdapterSupport;
        Object obj = ((AddressRow)addressRows.get(1)).addressTypeAdapterSupport;
        ValueAdapterSupport valueadaptersupport = ((AddressRow)addressRows.get(2)).addressTypeAdapterSupport;
        obj1 = (String)((ValueAdapterSupport) (obj1)).getSelectedItem();
        if (obj1 != null)
        {
            ((ValueAdapterSupport) (obj)).resetFilteringOut(ImmutableList.of(obj1));
            if (((AddressRow)addressRows.get(2)).isVisible())
            {
                String s = (String)valueadaptersupport.getSelectedItem();
                if (s != null && s.equals(((ValueAdapterSupport) (obj)).getSelectedItem()))
                {
                    ((ValueAdapterSupport) (obj)).selectPosition(1);
                }
            }
            obj = (String)((ValueAdapterSupport) (obj)).getSelectedItem();
            if (obj != null)
            {
                valueadaptersupport.resetFilteringOut(ImmutableList.of(obj1, obj));
            }
        }
    }

    private void handleRow1AddressTypeChange()
    {
        Object obj1 = ((AddressRow)addressRows.get(0)).addressTypeAdapterSupport;
        Object obj = ((AddressRow)addressRows.get(1)).addressTypeAdapterSupport;
        ValueAdapterSupport valueadaptersupport = ((AddressRow)addressRows.get(2)).addressTypeAdapterSupport;
        obj1 = (String)((ValueAdapterSupport) (obj1)).getSelectedItem();
        obj = (String)((ValueAdapterSupport) (obj)).getSelectedItem();
        if (obj1 != null && obj != null)
        {
            valueadaptersupport.resetFilteringOut(ImmutableList.of(obj1, obj));
        }
    }

    private void populateAddress(SavedLocationsSnapshot savedlocationssnapshot, boolean flag, ReverseGeoCodeConnection reversegeocodeconnection)
    {
        Object obj = savedlocationssnapshot.getFollowMeLocation();
        if (flag)
        {
            obj = savedlocationssnapshot.fixed().getFirstLocationWithTag("home");
            reversegeocodeconnection = savedlocationssnapshot.fixed().getFirstLocationWithTag("work");
            savedlocationssnapshot = savedlocationssnapshot.fixed().getFirstLocationWithTag("other");
            int i;
            if (obj != null)
            {
                Object obj1 = addressRows;
                i = 0 + 1;
                obj1 = (AddressRow)((List) (obj1)).get(0);
                ((AddressRow) (obj1)).setVisible(true);
                ((AddressRow) (obj1)).addressTypeAdapterSupport.resetFilteringOut(ImmutableList.of());
                ((AddressRow) (obj1)).addressTypeAdapterSupport.selectItem("home");
                ((AddressRow) (obj1)).address.setQuery(((SavedLocation) (obj)).getAddress(), true);
                ((AddressRow) (obj1)).address.setTag(((SavedLocation) (obj)).getAddress());
                moveCursorToStart(((AddressRow) (obj1)).address);
                ((AddressRow) (obj1)).address.clearFocus();
            } else
            {
                i = 0;
            }
            if (reversegeocodeconnection != null)
            {
                obj = addressRows;
                int j = i + 1;
                obj = (AddressRow)((List) (obj)).get(i);
                ((AddressRow) (obj)).setVisible(true);
                ((AddressRow) (obj)).addressTypeAdapterSupport.resetFilteringOut(ImmutableList.of());
                ((AddressRow) (obj)).addressTypeAdapterSupport.selectItem("work");
                ((AddressRow) (obj)).address.setQuery(reversegeocodeconnection.getAddress(), true);
                ((AddressRow) (obj)).address.setTag(reversegeocodeconnection.getAddress());
                moveCursorToStart(((AddressRow) (obj)).address);
                ((AddressRow) (obj)).address.clearFocus();
                i = j;
            }
            if (savedlocationssnapshot != null)
            {
                reversegeocodeconnection = (AddressRow)addressRows.get(i);
                reversegeocodeconnection.setVisible(true);
                ((AddressRow) (reversegeocodeconnection)).addressTypeAdapterSupport.resetFilteringOut(ImmutableList.of());
                ((AddressRow) (reversegeocodeconnection)).addressTypeAdapterSupport.selectItem("other");
                ((AddressRow) (reversegeocodeconnection)).address.setQuery(savedlocationssnapshot.getAddress(), true);
                ((AddressRow) (reversegeocodeconnection)).address.setTag(savedlocationssnapshot.getAddress());
                moveCursorToStart(((AddressRow) (reversegeocodeconnection)).address);
                ((AddressRow) (reversegeocodeconnection)).address.clearFocus();
            }
            savedlocationssnapshot = firstRow.deleteBtn;
            if (((AddressRow)addressRows.get(1)).isVisible())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            savedlocationssnapshot.setVisibility(i);
            savedlocationssnapshot = addAddressButton;
            if (lastRow.isVisible())
            {
                i = 8;
            } else
            {
                i = 0;
            }
            savedlocationssnapshot.setVisibility(i);
        } else
        if (obj != null && firstRow.address.getQuery().toString().isEmpty())
        {
            reversegeocodeconnection.asyncFetch(((SavedLocation) (obj)).getLat(), ((SavedLocation) (obj)).getLng(), new AddressListReceiver(), null);
            return;
        }
    }

    private void setAddress0IfEmpty(final AddressList result)
    {
        handler.post(new Runnable() {

            final AddressController this$0;
            final AddressList val$result;

            public void run()
            {
                if (firstRow.address.getQuery().toString().isEmpty())
                {
                    firstRow.address.setQuery(result.getFormattedAddress(0), true);
                    firstRow.address.setTag(result.getFormattedAddress(0));
                    moveCursorToStart(firstRow.address);
                }
            }

            
            {
                this$0 = AddressController.this;
                result = addresslist;
                super();
            }
        });
    }

    protected void moveCursorToStart(SearchView searchview)
    {
        ((EditText)searchview.findViewById(context.getResources().getIdentifier("android:id/search_src_text", null, null))).setSelection(0);
    }

    void saveAddresses()
    {
        ArrayList arraylist = new ArrayList(addressRows.size());
        Iterator iterator = addressRows.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (AddressRow)iterator.next();
            if (((AddressRow) (obj)).isVisible() && ((AddressRow) (obj)).address != null && ((AddressRow) (obj)).address.getTag() != null)
            {
                arraylist.add(((AddressRow) (obj)).getAddressRecord());
            } else
            {
                obj = ((AddressRow) (obj)).getAddressRecord().tag;
                if (obj != null)
                {
                    FixedLocations.getInstance().clearTagInAllLocations(((String) (obj)));
                }
            }
        } while (true);
        (new SaveAddressTask()).execute(arraylist.toArray(new AddressRecord[arraylist.size()]));
    }

    void saveInstanceState(Bundle bundle)
    {
        AddressRow addressrow = (AddressRow)addressRows.get(1);
        bundle.putSerializable("AddressTypeString", (Serializable)firstRow.addressTypeAdapterSupport.getSelectedItem());
        bundle.putSerializable("AddressTypeOneString", (Serializable)addressrow.addressTypeAdapterSupport.getSelectedItem());
        bundle.putSerializable("AddressTypeTwoString", (Serializable)lastRow.addressTypeAdapterSupport.getSelectedItem());
        bundle.putBoolean("AddressOneVisible", addressrow.isVisible());
        bundle.putBoolean("AddressTwoVisible", lastRow.isVisible());
    }

    boolean validateInput()
    {
        boolean flag = true;
        for (Iterator iterator = addressRows.iterator(); iterator.hasNext();)
        {
            flag &= ((AddressRow)iterator.next()).validateInput();
        }

        return flag;
    }









}
