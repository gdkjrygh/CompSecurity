// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.Supplier;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttribute;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsAttributeValue;
import com.weather.commons.analytics.settings.LocalyticsGeneralSettingsSummaryRecorder;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;
import com.weather.commons.ups.backend.GooglePlusTaskRunner;
import com.weather.commons.ups.backend.location.LocationEndSyncService;
import com.weather.dal2.DalPrefs;
import com.weather.dal2.google.ReverseGeoCodeConnection;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.dal2.ups.BasicDemographicsStorage;
import com.weather.dal2.ups.Demographics;
import com.weather.util.app.FragmentHelper;
import com.weather.util.bitmaps.CircleImageTransform;
import com.weather.util.date.Day;
import com.weather.util.device.LocaleUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.ValueAdapterSupport;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

// Referenced classes of package com.weather.commons.ups.ui:
//            ProfileFragment, SaveDemographicsInfoTask, ImagePreviewDialog, AddressController, 
//            ChangeEmailFragment, ChangePasswordFragment

public class AccountSettingsFragment extends ProfileFragment
{
    private class AvatarOnClickListener
        implements android.view.View.OnClickListener
    {

        final ImageView avatarView;
        final AccountSettingsFragment this$0;

        public void onClick(View view)
        {
            if (activity == null)
            {
                return;
            } else
            {
                view = new android.app.AlertDialog.Builder(activity);
                ListView listview = new ListView(activity);
                String as[] = getResources().getStringArray(com.weather.commons.R.array.avatar_photo_options);
                listview.setAdapter(new ArrayAdapter(activity, 0x1090003, 0x1020014, as));
                view.setView(listview);
                view.setTitle(getString(com.weather.commons.R.string.avatar_profile_picture));
                listview.setOnItemClickListener(new AvatarOptionsClickListener(view.create()));
                return;
            }
        }

        AvatarOnClickListener(ImageView imageview)
        {
            this$0 = AccountSettingsFragment.this;
            super();
            avatarView = imageview;
        }
    }

    private class AvatarOnClickListener.AvatarOptionsClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        private final AlertDialog dialog;
        final AvatarOnClickListener this$1;

        private File getFileForCamera()
            throws IOException
        {
            File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (file == null || !file.exists())
            {
                throw new IOException("Unable to find an external public directory");
            } else
            {
                return new File(file, "ProfileImage.jpg");
            }
        }

        private void selectImageFromGallery()
        {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(intent, 1);
        }

        private void setAvatarToDefaultImage()
        {
            Picasso.with(getActivity()).load(com.weather.commons.R.drawable.default_avatar).transform(new CircleImageTransform(getResources().getDimensionPixelSize(com.weather.commons.R.dimen.account_settings_avatar_size))).noFade().into((ImageView)mainLayout.findViewById(com.weather.commons.R.id.account_settings_avatar));
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI, "");
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, false);
        }

        private void takePhoto()
        {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try
            {
                cameraImageFile = getFileForCamera();
                if (intent.resolveActivity(activity.getPackageManager()) != null)
                {
                    intent.putExtra("output", Uri.fromFile(cameraImageFile));
                    startActivityForResult(intent, 2);
                }
                return;
            }
            catch (IOException ioexception)
            {
                LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, "Unable to create file for image storage", new Object[] {
                    ioexception
                });
            }
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            i;
            JVM INSTR tableswitch 0 2: default 28
        //                       0 36
        //                       1 43
        //                       2 62;
               goto _L1 _L2 _L3 _L4
_L1:
            dialog.dismiss();
            return;
_L2:
            takePhoto();
            continue; /* Loop/switch isn't completed */
_L3:
            saveDemographicsChanges = false;
            selectImageFromGallery();
            continue; /* Loop/switch isn't completed */
_L4:
            setAvatarToDefaultImage();
            if (true) goto _L1; else goto _L5
_L5:
        }

        AvatarOnClickListener.AvatarOptionsClickListener(AlertDialog alertdialog)
        {
            this$1 = AvatarOnClickListener.this;
            super();
            dialog = alertdialog;
        }
    }

    private final class DeleteAccountOnClickListener
        implements android.view.View.OnClickListener
    {

        private static final int TEXT_SIZE = 18;
        final AccountSettingsFragment this$0;

        public void onClick(View view)
        {
            view = new TextView(activity);
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 17);
            view.setText(getString(com.weather.commons.R.string.account_settings_delete_account_description));
            view.setLayoutParams(layoutparams);
            view.setGravity(1);
            int i = getResources().getDimensionPixelSize(com.weather.commons.R.dimen.wx_profile_page_delete_dialog_padding);
            view.setPadding(i, i, i, i);
            view.setTextSize(18F);
            (new android.app.AlertDialog.Builder(activity)).setPositiveButton(com.weather.commons.R.string.account_settings_delete_account_title, new android.content.DialogInterface.OnClickListener() {

                final DeleteAccountOnClickListener this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    Analytics.trackAction(getResources().getString(com.weather.commons.R.string.beacon_ups_account_delete), null);
                    saveDemographicsChanges = false;
                    dialoginterface = new ProgressDialog(activity);
                    dialoginterface.setMessage(getString(com.weather.commons.R.string.deleting_account_msg));
                    dialoginterface.setCancelable(false);
                    dialoginterface.show();
                    (new com.weather.commons.ups.backend.UpsCommonUtil.DeleteAccountTask(activity, false, dialoginterface)).execute(new Void[0]);
                }

            
            {
                this$1 = DeleteAccountOnClickListener.this;
                super();
            }
            }).setNegativeButton(com.weather.commons.R.string.account_settings_delete_cancel, new android.content.DialogInterface.OnClickListener() {

                final DeleteAccountOnClickListener this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$1 = DeleteAccountOnClickListener.this;
                super();
            }
            }).setView(view).show();
        }

        private DeleteAccountOnClickListener()
        {
            this$0 = AccountSettingsFragment.this;
            super();
        }

    }

    private class GetDemographicsInfoTask extends AsyncTask
    {

        final AccountSettingsFragment this$0;

        private void setCableProviderSpinner(String s)
        {
            if (s != null)
            {
                int j = cableProviderAdapter.getPosition(s);
                s = cableProviderSpinner;
                int i = j;
                if (j == -1)
                {
                    i = 0;
                }
                s.setSelection(i);
            }
        }

        private void setDateOfBirth(CharSequence charsequence)
        {
            if (charsequence != null)
            {
                charsequence = Day.valueOf(charsequence);
                dateOfBirth = charsequence;
                userAge = dateOfBirth.getAge();
                if (charsequence != null)
                {
                    userAge = charsequence.getAge();
                    setDateBasedOnDeviceLocale(charsequence.getMonthOfYear() + 1, charsequence.getYear(), charsequence.getDayOfMonth());
                }
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
                LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, exception.getMessage(), new Object[0]);
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
            initialDemographics = demographics;
            if (isVisible() && demographics != null)
            {
                firstName = demographics.getFirstName();
                lastName = demographics.getLastName();
                String s = demographics.getTwcAccountEmail();
                String s1 = demographics.getGender();
                if (firstName != null)
                {
                    String s2 = String.format("%s %s", new Object[] {
                        firstName, lastName
                    });
                    fullName.setText(s2);
                }
                if (s != null)
                {
                    tvEmail.setText(s);
                    tvEmail.setTextColor(getResources().getColor(0x106000c));
                } else
                {
                    tvEmail.setTextColor(getResources().getColor(com.weather.commons.R.color.ups_signup_or_color));
                }
                setDateOfBirth(demographics.getDateOfBirth());
                if (s1 != null)
                {
                    setGender(s1);
                }
                setCableProviderSpinner(demographics.getCableProvider());
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Demographics)obj);
        }

        private GetDemographicsInfoTask()
        {
            this$0 = AccountSettingsFragment.this;
            super();
        }

    }

    private class GetEmailTask extends AsyncTask
    {

        final AccountSettingsFragment this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            return AccountManager.getInstance().getWxAccountId();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
label0:
            {
                if (isAdded())
                {
                    if (s == null)
                    {
                        break label0;
                    }
                    tvEmail.setText(s);
                    tvEmail.setTextColor(getResources().getColor(0x106000c));
                }
                return;
            }
            tvEmail.setTextColor(getResources().getColor(com.weather.commons.R.color.ups_signup_or_color));
        }

        private GetEmailTask()
        {
            this$0 = AccountSettingsFragment.this;
            super();
        }

    }

    private class LogoutTask extends AsyncTask
    {

        private boolean loggedOut;
        private boolean permissionsRevoked;
        final AccountSettingsFragment this$0;

        private void cleanup()
        {
            if (!loggedOut || !permissionsRevoked)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            progressDialog.dismiss();
            LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.UPS_LOGOUT);
            KahunaEvents.getInstance().loggedIn(false);
            getActivity().onBackPressed();
            return;
            Exception exception;
            exception;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            accountManager.logout(true);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            loggedOut = true;
            cleanup();
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            if (accountManager.getLoginType() == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS)
            {
                GooglePlusConnectionManager googleplusconnectionmanager = GooglePlusConnectionManager.getInstance();
                (new GooglePlusTaskRunner(new Runnable() {

                    final LogoutTask this$1;

                    public void run()
                    {
                        GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
                        permissionsRevoked = true;
                        cleanup();
                    }

            
            {
                this$1 = LogoutTask.this;
                super();
            }
                }, googleplusconnectionmanager, new Supplier() {

                    final LogoutTask this$1;

                    public Activity get()
                    {
                        return activity;
                    }

                    public volatile Object get()
                    {
                        return get();
                    }

            
            {
                this$1 = LogoutTask.this;
                super();
            }
                })).execute();
                return;
            } else
            {
                permissionsRevoked = true;
                return;
            }
        }


/*
        static boolean access$1902(LogoutTask logouttask, boolean flag)
        {
            logouttask.permissionsRevoked = flag;
            return flag;
        }

*/


        private LogoutTask()
        {
            this$0 = AccountSettingsFragment.this;
            super();
        }

    }


    private static final int CROP_IMAGE = 3;
    private static final int REQUEST_CROP_IMAGE = 4;
    private static final int REQUEST_IMAGE = 1;
    private static final int REQUEST_IMAGE_CAPTURE = 2;
    private static final int SETTINGS = 1;
    private static final char SPACE = 32;
    private static final String TAG = "AccountSettingsFragment";
    private static final int UNDER_AGE_EIGHTEEN = 18;
    private static final int UNDER_AGE_THIRTEEN = 13;
    private final AccountManager accountManager = AccountManager.getInstance();
    private Activity activity;
    private AddressController addressController;
    private ArrayAdapter cableProviderAdapter;
    private Spinner cableProviderSpinner;
    private volatile File cameraImageFile;
    private boolean changeEmailClicked;
    private TextView debugInfo;
    private String firstName;
    private EditText fullName;
    private Demographics initialDemographics;
    private String lastName;
    private View mainLayout;
    private ProgressDialog progressDialog;
    private boolean saveDemographicsChanges;
    private boolean showImageDialog;
    private final BroadcastReceiver syncResultReceiver = new BroadcastReceiver() {

        final AccountSettingsFragment this$0;

        public void onReceive(Context context, Intent intent)
        {
            (new LogoutTask()).execute(new Void[0]);
            context.unregisterReceiver(syncResultReceiver);
        }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
    };
    private TextView tvEmail;

    public AccountSettingsFragment()
    {
        super(com.weather.commons.R.layout.ups_account_setting_fragment);
        saveDemographicsChanges = true;
    }

    private Demographics buildUpdatedDemographics()
    {
        Object obj = (com.weather.dal2.ups.Demographics.Gender)genderAdapterSupport.getSelectedItem();
        if (dateOfBirth != null)
        {
            com.weather.dal2.ups.Demographics.AgeRange.lookupRange(String.valueOf(dateOfBirth.getAge()));
        }
        String s = getCableProvider();
        String s1 = tvEmail.getText().toString();
        upDateFirstAndLastName();
        obj = new Demographics(null, dateOfBirth, null, ((com.weather.dal2.ups.Demographics.Gender) (obj)));
        ((Demographics) (obj)).setFirstName(firstName);
        ((Demographics) (obj)).setLastName(lastName);
        ((Demographics) (obj)).setCableProvider(s);
        ((Demographics) (obj)).setTwcAccountEmail(s1);
        return ((Demographics) (obj));
    }

    private boolean cableProviderIsHeadline(String s)
    {
        return s.equals(getString(com.weather.commons.R.string.cable_provider_headline));
    }

    private String getCableProvider()
    {
        String s1 = cableProviderSpinner.getSelectedItem().toString();
        String s = s1;
        if (cableProviderIsHeadline(s1))
        {
            s = null;
        }
        return s;
    }

    private void handleCameraResult(int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (cameraImageFile == null) goto _L4; else goto _L3
_L3:
        if (!cameraImageFile.canRead())
        {
            showToast(getString(com.weather.commons.R.string.chat_take_photo_error));
        }
        loadAvatarImage((ImageView)mainLayout.findViewById(com.weather.commons.R.id.account_settings_avatar), Uri.fromFile(cameraImageFile).toString());
_L6:
        return;
_L4:
        LogUtil.w("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, "imagePath was null, don't know where to get camera's captured image, bailing...", new Object[0]);
        showToast(getString(com.weather.commons.R.string.chat_take_photo_error));
        return;
_L2:
        if (i != 0)
        {
            LogUtil.d("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, "User has cancelled the action", new Object[0]);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void loadAvatar(com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider, ImageView imageview)
    {
        String s;
label0:
        {
            if (TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI))
            {
                s = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI, "");
            } else
            {
                s = "";
            }
            if (!TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI))
            {
                TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, true);
            }
            if (TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, true))
            {
                if (!s.isEmpty())
                {
                    break label0;
                }
                loadSocialMediaAvatar(imageview, accountprovider);
            }
            return;
        }
        loadAvatarImage(imageview, s);
    }

    private void loadAvatarImage(ImageView imageview, String s)
    {
        int i = getResources().getDimensionPixelSize(com.weather.commons.R.dimen.account_settings_avatar_size);
        LogUtil.d("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, (new StringBuilder()).append("cameraImageFile ").append(s).append("  ").append(imageview).toString(), new Object[0]);
        Picasso.with(getActivity()).load(s).transform(new CircleImageTransform(i)).placeholder(com.weather.commons.R.drawable.default_avatar).resize(i, i).skipMemoryCache().centerCrop().noFade().into(imageview);
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI, s);
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, true);
    }

    private void loadFacebookAvatar(ImageView imageview)
    {
        String s = DalPrefs.getInstance().getString(com.weather.dal2.DalPrefs.Keys.LOGGED_IN_ACCOUNT_ID, "");
        if (!s.isEmpty())
        {
            s = URLEncoder.encode(s);
            loadAvatarImage(imageview, (new StringBuilder()).append("https://graph.facebook.com/").append(s).append("/picture?type=large").toString());
        }
    }

    private void loadGoogleAvatar(final ImageView avatarView)
    {
        (new GooglePlusTaskRunner(new Runnable() {

            final AccountSettingsFragment this$0;
            final ImageView val$avatarView;

            public void run()
            {
                int i = getResources().getDimensionPixelSize(com.weather.commons.R.dimen.account_settings_avatar_size);
                String s = GooglePlusConnectionManager.getInstance().getCurrentImagePath(i);
                if (s != null)
                {
                    loadAvatarImage(avatarView, s);
                }
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                avatarView = imageview;
                super();
            }
        }, GooglePlusConnectionManager.getInstance(), new Supplier() {

            final AccountSettingsFragment this$0;

            public Activity get()
            {
                return getActivity();
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        })).execute();
    }

    private void loadSocialMediaAvatar(ImageView imageview, com.weather.commons.ups.facade.DsxAccount.AccountProvider accountprovider)
    {
        if (accountprovider == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_FACEBOOK)
        {
            loadFacebookAvatar(imageview);
        } else
        if (accountprovider == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_GOOGLE_PLUS)
        {
            loadGoogleAvatar(imageview);
            return;
        }
    }

    private void populateDemographicsInfo()
    {
        (new GetDemographicsInfoTask()).execute(new Void[0]);
    }

    private void saveDemographicsInfo(Demographics demographics)
    {
        ProgressDialog progressdialog = new ProgressDialog(getActivity());
        (new SaveDemographicsInfoTask(getActivity(), progressdialog)).execute(new Demographics[] {
            demographics
        });
    }

    private void showAvatarConfirmationDialog(Uri uri)
    {
        ImagePreviewDialog imagepreviewdialog = new ImagePreviewDialog();
        imagepreviewdialog.setImageUri(uri);
        imagepreviewdialog.show(getActivity().getFragmentManager(), "dialog");
    }

    private void showLogoutConfirmationDialog()
    {
        String s = getResources().getString(com.weather.commons.R.string.settings_logout_message);
        (new android.app.AlertDialog.Builder(activity)).setMessage(s).setPositiveButton(com.weather.commons.R.string.logout_confirmation_yes, new android.content.DialogInterface.OnClickListener() {

            final AccountSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                saveDemographicsChanges = false;
                Analytics.trackAction(getResources().getString(com.weather.commons.R.string.beacon_ups_account_logout), null);
                LocalyticsHandler.getInstance().getGeneralSettingsSummaryRecorder().putValue(LocalyticsGeneralSettingsAttribute.LOGOUT_LOGIN_CLICKED, LocalyticsGeneralSettingsAttributeValue.LOGOUT.getAttributeValue());
                try
                {
                    progressDialog = new ProgressDialog(activity);
                    progressDialog.setMessage(getString(com.weather.commons.R.string.logging_out_msg));
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, dialoginterface.getMessage(), new Object[] {
                        dialoginterface
                    });
                }
                activity.startService(new Intent(activity, com/weather/commons/ups/backend/location/LocationEndSyncService));
                dialoginterface = new IntentFilter(getString(com.weather.commons.R.string.sync_task_result));
                activity.registerReceiver(syncResultReceiver, dialoginterface);
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        }).setNegativeButton(com.weather.commons.R.string.logout_confirmation_no, new android.content.DialogInterface.OnClickListener() {

            final AccountSettingsFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        }).show();
    }

    private void showToast(CharSequence charsequence)
    {
        Toast.makeText(activity, charsequence, 1).show();
    }

    private void upDateFirstAndLastName()
    {
        String s;
label0:
        {
            s = fullName.getText().toString();
            if (!s.isEmpty())
            {
                int i = s.indexOf(' ');
                if (i == -1)
                {
                    break label0;
                }
                firstName = s.substring(0, i);
                lastName = s.substring(i + 1);
            }
            return;
        }
        firstName = s;
        lastName = "";
    }

    private boolean validateInput()
    {
        if (birthDate != null && birthDate.getText() != getString(com.weather.commons.R.string.birthdate_sign_up_hint))
        {
            if (LocaleUtil.isDeviceInUS())
            {
                if (userAge < 13)
                {
                    Toast.makeText(getActivity(), com.weather.commons.R.string.under_age_update_error, 1).show();
                    return false;
                }
            } else
            if (userAge < 18)
            {
                Toast.makeText(getActivity(), com.weather.commons.R.string.under_age_update_error, 1).show();
                return false;
            }
        }
        return true;
    }

    protected boolean isSetDateValid(Day day)
    {
        int i = userAge;
        userAge = day.getAge();
        if (!validateInput())
        {
            userAge = i;
            return false;
        }
        if (userAge < 13)
        {
            Toast.makeText(getActivity(), com.weather.commons.R.string.under_age_update_error, 1).show();
            return false;
        } else
        {
            return true;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        LogUtil.v("AccountSettingsFragment", LoggingMetaTags.TWC_WX_PICTURE, "onActivityResult: requestCode=%s, resultCode=%s, data=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), intent
        });
        saveDemographicsChanges = true;
        i;
        JVM INSTR tableswitch 1 3: default 72
    //                   1 73
    //                   2 87
    //                   3 93;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (j == -1)
        {
            showAvatarConfirmationDialog(intent.getData());
            return;
        }
          goto _L1
_L3:
        handleCameraResult(j);
        return;
_L4:
        showImageDialog = true;
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        activity = getActivity();
        if (activity == null)
        {
            return null;
        }
        mainLayout = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (mainLayout == null)
        {
            return null;
        }
        layoutinflater = activity.getActionBar();
        if (layoutinflater != null)
        {
            layoutinflater.setTitle(activity.getResources().getString(com.weather.commons.R.string.account_settings_title));
        }
        fullName = (EditText)mainLayout.findViewById(com.weather.commons.R.id.et_user_name);
        tvEmail = (TextView)mainLayout.findViewById(com.weather.commons.R.id.tvEmail);
        viewgroup = (TextView)mainLayout.findViewById(com.weather.commons.R.id.password);
        ((LinearLayout)mainLayout.findViewById(com.weather.commons.R.id.layout_account_logout)).setOnClickListener(new android.view.View.OnClickListener() {

            final AccountSettingsFragment this$0;

            public void onClick(View view)
            {
                showLogoutConfirmationDialog();
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        });
        ((LinearLayout)mainLayout.findViewById(com.weather.commons.R.id.layout_delete_account)).setOnClickListener(new DeleteAccountOnClickListener());
        Object obj = (LinearLayout)mainLayout.findViewById(com.weather.commons.R.id.layoutChangeEmail);
        layoutinflater = (LinearLayout)mainLayout.findViewById(com.weather.commons.R.id.layoutChangePassword);
        ((LinearLayout) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final AccountSettingsFragment this$0;

            public void onClick(View view)
            {
                view = getFragmentManager();
                if (view != null)
                {
                    changeEmailClicked = true;
                    saveDemographicsChanges = false;
                    FragmentHelper.switchToNewFragment(view, new ChangeEmailFragment());
                }
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        });
        viewgroup.setTransformationMethod(PasswordTransformationMethod.getInstance());
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final AccountSettingsFragment this$0;

            public void onClick(View view)
            {
                view = getFragmentManager();
                if (view != null)
                {
                    saveDemographicsChanges = false;
                    FragmentHelper.switchToNewFragment(view, new ChangePasswordFragment());
                }
            }

            
            {
                this$0 = AccountSettingsFragment.this;
                super();
            }
        });
        addressController = new AddressController(mainLayout, new Handler(), new SavedLocationsSnapshot(), true, new ReverseGeoCodeConnection(), bundle);
        cableProviderSpinner = (Spinner)mainLayout.findViewById(com.weather.commons.R.id.ups_cable_provider);
        cableProviderAdapter = ArrayAdapter.createFromResource(getActivity(), com.weather.commons.R.array.cable_provider_options, com.weather.commons.R.layout.ups_spinner_item);
        cableProviderAdapter.setDropDownViewResource(0x1090009);
        cableProviderSpinner.setAdapter(cableProviderAdapter);
        cableProviderSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AccountSettingsFragment this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
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
                this$0 = AccountSettingsFragment.this;
                super();
            }
        });
        ImageView imageview;
        if (bundle != null)
        {
            genderAdapterSupport.selectItem((com.weather.dal2.ups.Demographics.Gender)bundle.get("GenderString"));
        } else
        {
            populateDemographicsInfo();
        }
        viewgroup = accountManager.getLoginType();
        if (viewgroup == com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_WEATHER_CHANNEL)
        {
            (new GetEmailTask()).execute(new Void[0]);
        } else
        {
            layoutinflater.setVisibility(8);
            ((ImageView)mainLayout.findViewById(com.weather.commons.R.id.divider2)).setVisibility(8);
        }
        debugInfo = (TextView)mainLayout.findViewById(com.weather.commons.R.id.debugInfo);
        if (viewgroup == null)
        {
            layoutinflater = "";
        } else
        {
            layoutinflater = viewgroup.getProviderName(getActivity());
        }
        bundle = (TextView)mainLayout.findViewById(com.weather.commons.R.id.account_settings_signin_method_txt);
        bundle.setText(getString(com.weather.commons.R.string.account_settings_signed_in, new Object[] {
            layoutinflater
        }));
        obj = (RelativeLayout)mainLayout.findViewById(com.weather.commons.R.id.avatar_container);
        imageview = (ImageView)mainLayout.findViewById(com.weather.commons.R.id.account_settings_avatar);
        ((RelativeLayout) (obj)).setOnClickListener(new AvatarOnClickListener(imageview));
        if (!layoutinflater.equals(getResources().getString(com.weather.commons.R.string.app_name)))
        {
            loadAvatar(viewgroup, imageview);
        } else
        {
            mainLayout.findViewById(com.weather.commons.R.id.avatar_container).setVisibility(8);
            bundle.setVisibility(8);
        }
        return mainLayout;
    }

    public void onPause()
    {
        boolean flag = false;
        if (saveDemographicsChanges)
        {
            if (validateInput())
            {
                addressController.saveAddresses();
                Demographics demographics = buildUpdatedDemographics();
                if (initialDemographics == null || !initialDemographics.equals(demographics))
                {
                    flag = true;
                }
                if (flag)
                {
                    saveDemographicsInfo(demographics);
                }
            } else
            {
                (new com.weather.commons.ups.backend.UpsCommonUtil.DeleteAccountTask(getActivity(), false, null)).execute(new Void[0]);
            }
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (changeEmailClicked)
        {
            (new GetEmailTask()).execute(new Void[0]);
            changeEmailClicked = false;
        }
        saveDemographicsChanges = true;
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.WX_PROFILE_SETTINGS);
        if (!LogUtil.isLoggable(LoggingMetaTags.TWC_UPS, 3) || debugInfo == null) goto _L2; else goto _L1
_L1:
        debugInfo.setVisibility(0);
        debugInfo.setText((new StringBuilder()).append("Cookie: ").append(AccountManager.getInstance().getDsxCookie()).toString());
_L4:
        if (AccountManager.getInstance().getLoginStatus() == com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT)
        {
            getActivity().onBackPressed();
        }
        return;
_L2:
        if (debugInfo != null)
        {
            debugInfo.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (addressController != null)
        {
            addressController.saveInstanceState(bundle);
        }
    }



/*
    static Demographics access$1002(AccountSettingsFragment accountsettingsfragment, Demographics demographics)
    {
        accountsettingsfragment.initialDemographics = demographics;
        return demographics;
    }

*/



/*
    static String access$1102(AccountSettingsFragment accountsettingsfragment, String s)
    {
        accountsettingsfragment.firstName = s;
        return s;
    }

*/



/*
    static String access$1202(AccountSettingsFragment accountsettingsfragment, String s)
    {
        accountsettingsfragment.lastName = s;
        return s;
    }

*/







/*
    static boolean access$202(AccountSettingsFragment accountsettingsfragment, boolean flag)
    {
        accountsettingsfragment.changeEmailClicked = flag;
        return flag;
    }

*/



/*
    static ProgressDialog access$2102(AccountSettingsFragment accountsettingsfragment, ProgressDialog progressdialog)
    {
        accountsettingsfragment.progressDialog = progressdialog;
        return progressdialog;
    }

*/



/*
    static File access$2202(AccountSettingsFragment accountsettingsfragment, File file)
    {
        accountsettingsfragment.cameraImageFile = file;
        return file;
    }

*/



/*
    static boolean access$302(AccountSettingsFragment accountsettingsfragment, boolean flag)
    {
        accountsettingsfragment.saveDemographicsChanges = flag;
        return flag;
    }

*/




}
