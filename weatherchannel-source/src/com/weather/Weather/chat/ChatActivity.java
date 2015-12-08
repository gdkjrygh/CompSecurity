// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.NavUtils;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.Attribute;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.chat.ChatSummaryRecorder;
import com.weather.commons.analytics.chat.LocalyticsChatAttributeValues;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.FollowMeCurrentWeatherFacade;
import com.weather.commons.share.FacebookUtils;
import com.weather.commons.share.MessengerUtils;
import com.weather.commons.share.ShareMediaSupport;
import com.weather.commons.share.ShareableMedia;
import com.weather.commons.share.SimpleMediaSharer;
import com.weather.commons.share.SimpleShareableMedia;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.system.TwcBus;
import com.weather.util.bitmaps.BitmapUtil;
import com.weather.util.intent.IntentUtils;
import com.weather.util.intent.MimeType;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

// Referenced classes of package com.weather.Weather.chat:
//            ChatOverlayViewer, ChatPrefs, ChatImageCreator, ChatOverlayData

public final class ChatActivity extends TWCBaseActivity
{
    private static class ChatShareMediaSupport extends ShareMediaSupport
    {

        public void fireBeacon(ShareableMedia shareablemedia)
        {
            Analytics.trackState(context.getString(0x7f0704c0), null);
        }

        ChatShareMediaSupport(Context context, int i, int j, int k, int l)
        {
            super(context, i, j, k, l);
        }
    }

    private class FbClick
        implements android.view.View.OnClickListener
    {

        final ChatActivity this$0;

        public void onClick(View view)
        {
            localyticsHandler.getChatSummaryRecorder().incrementShareAttempt();
            view = userMessage.getText();
            int i;
            if (TextUtils.isEmpty(view))
            {
                i = 4;
            } else
            {
                i = userMessage.getVisibility();
            }
            setUserMessageAnalytics(i);
            if (IntentUtils.isInstalled(ChatActivity.this, "com.facebook.katana"))
            {
                view = updateImage(photoViewAttacher.getVisibleRectangleBitmap(), 0x7f03001a, new ChatOverlayData(view, i, pictureTime, weatherFacade, 0));
                if (view != null)
                {
                    LocalyticsHandler.getInstance().getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    view = Uri.fromFile(view);
                    view = FacebookUtils.getMediaShareIntent(ChatActivity.this, view, MimeType.IMAGE);
                    Analytics.trackState(getString(0x7f0704c1), null);
                    sendAnalytics(LocalyticsChatAttributeValues.PLATFORM_FACEBOOK);
                    FacebookUtils.share(ChatActivity.this, view);
                }
                return;
            } else
            {
                IntentUtils.launchOrInstall(ChatActivity.this, "com.facebook.katana", null);
                return;
            }
        }

        private FbClick()
        {
            this$0 = ChatActivity.this;
            super();
        }

    }

    private class FbmClick
        implements android.view.View.OnClickListener
    {

        final ChatActivity this$0;

        public void onClick(View view)
        {
            localyticsHandler.getChatSummaryRecorder().incrementShareAttempt();
            view = userMessage.getText();
            int i;
            if (TextUtils.isEmpty(view))
            {
                i = 4;
            } else
            {
                i = userMessage.getVisibility();
            }
            setUserMessageAnalytics(i);
            if (IntentUtils.isInstalled(ChatActivity.this, "com.facebook.orca"))
            {
                view = updateImage(photoViewAttacher.getVisibleRectangleBitmap(), 0x7f03001a, new ChatOverlayData(view, i, pictureTime, weatherFacade, 4));
                if (view != null)
                {
                    Object obj = Uri.fromFile(view);
                    LocalyticsHandler.getInstance().getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    view = getIntent();
                    if (MessengerUtils.isReplyRequest(view))
                    {
                        obj = MessengerUtils.getMediaReplyIntent(ChatActivity.this, view, ((Uri) (obj)), MimeType.IMAGE, Long.toString(System.currentTimeMillis()));
                        LogUtil.d("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "got metadata: %s", new Object[] {
                            MessengerUtils.getMetadata(view)
                        });
                        Analytics.trackState(getString(0x7f0704c3), null);
                        MessengerUtils.reply(ChatActivity.this, ((Intent) (obj)));
                    } else
                    {
                        view = MessengerUtils.getMediaShareIntent(ChatActivity.this, ((Uri) (obj)), MimeType.IMAGE, Long.toString(System.currentTimeMillis()));
                        Analytics.trackState(getString(0x7f0704c2), null);
                        MessengerUtils.share(ChatActivity.this, view);
                    }
                    sendAnalytics(LocalyticsChatAttributeValues.PLATFORM_FACEBOOK_MESSAGER);
                }
                return;
            } else
            {
                IntentUtils.launchOrInstall(ChatActivity.this, "com.facebook.orca", null);
                return;
            }
        }

        private FbmClick()
        {
            this$0 = ChatActivity.this;
            super();
        }

    }

    private class ShareClick
        implements android.view.View.OnClickListener
    {

        private final ShareMediaSupport shareSupport;
        private final SimpleMediaSharer sms;
        final ChatActivity this$0;

        public void onClick(View view)
        {
            localyticsHandler.getChatSummaryRecorder().incrementShareAttempt();
            view = userMessage.getText();
            int i;
            if (TextUtils.isEmpty(view))
            {
                i = 4;
            } else
            {
                i = userMessage.getVisibility();
            }
            setUserMessageAnalytics(i);
            view = updateImage(photoViewAttacher.getVisibleRectangleBitmap(), 0x7f03001a, new ChatOverlayData(view, i, pictureTime, weatherFacade, 0));
            if (view != null)
            {
                LocalyticsHandler.getInstance().getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                view = Uri.fromFile(view);
                Set set = sms.getBlackList();
                set.add("com.facebook.katana");
                set.add("com.facebook.orca");
                sms.setBlackList(set);
                sms.share(new SimpleShareableMedia("", view, MimeType.IMAGE));
                sendAnalytics(LocalyticsChatAttributeValues.PLATFORM_GENERAL);
            }
        }

        private ShareClick()
        {
            this$0 = ChatActivity.this;
            super();
            shareSupport = new ChatShareMediaSupport(ChatActivity.this, 0x7f0704f3, 0x7f0704f2, 0x7f0704f4, 0x7f0702b1);
            sms = new SimpleMediaSharer(ChatActivity.this, shareSupport);
        }

    }


    private static final int CLICK_HOLDOFF_MS = 300;
    private static final char FILE_NAME_SEPARATOR = 95;
    private static final float MAXIMUM_USER_ZOOM = 5F;
    private static final String PIC_FILE_EXTRA = "com.weather.Weather.chat.ChatActivity.rawCameraFile";
    private static final int REQUEST_IMAGE_CAPTURE = 2;
    private static final String TAG = "ChatActivity";
    private final android.view.View.OnClickListener fbClick = new FbClick();
    private final android.view.View.OnClickListener fbmClick = new FbmClick();
    private Handler handler;
    private AlertDialog lbsDialog;
    private final LocalyticsHandler localyticsHandler = LocalyticsHandler.getInstance();
    private ChatOverlayViewer overlayViewer;
    private PhotoView photoView;
    private PhotoViewAttacher photoViewAttacher;
    private long pictureTime;
    private volatile File rawCameraImageFile;
    private long resumeTime;
    private final android.view.View.OnClickListener shareClick = new ShareClick();
    private boolean showTutorial;
    private Dialog tutorialDialog;
    private EditText userMessage;
    private CurrentWeatherFacade weatherFacade;

    public ChatActivity()
    {
    }

    private File createPublicImageFile()
        throws IOException
    {
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        file.mkdirs();
        String s = (new SimpleDateFormat("yyyyMMdd_HHmm", Locale.US)).format(new Date());
        file = File.createTempFile((new StringBuilder()).append("weatherChat").append(s).append('_').toString(), ".jpg", file);
        LogUtil.d("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "publicFile=%s, exists=%s", new Object[] {
            file.getAbsolutePath(), Boolean.valueOf(file.exists())
        });
        return file;
    }

    private void finishAndSetupMainFeed()
    {
        if (wasCreatedFromMainFeed())
        {
            onReturnToMainFeed();
        }
        finish();
    }

    private File getFileForRawCameraImage()
        throws IOException
    {
        File file = getExternalCacheDir();
        if (file == null)
        {
            throw new IOException("Unable to find an external cache directory");
        }
        file.mkdirs();
        if (!file.exists())
        {
            throw new IOException("Unable to use an external cache directory");
        } else
        {
            return new File(file, "WeatherChatImage.jpg");
        }
    }

    private int getMaxLines(EditText edittext)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return edittext.getMaxLines();
        } else
        {
            return 2;
        }
    }

    private void handleCameraResult(int i)
    {
        if (i == -1)
        {
            if (rawCameraImageFile != null)
            {
                localyticsHandler.getChatSummaryRecorder().photoType();
                ingestImage(rawCameraImageFile);
                return;
            } else
            {
                LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "handleCameraResult: rawCameraImageFile was null, no camera image to use, bailing...", new Object[0]);
                showToast(getString(0x7f070091));
                localyticsHandler.getChatSummaryRecorder().cameraFileError();
                finishAndSetupMainFeed();
                return;
            }
        }
        if (i != 0)
        {
            LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "handleCameraResult: unknown resultCode=%s", new Object[] {
                Integer.valueOf(i)
            });
            showToast(getString(0x7f070091));
            finishAndSetupMainFeed();
            localyticsHandler.getChatSummaryRecorder().cameraUnknownError();
            return;
        } else
        {
            LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "handleCameraResult: cancelled", new Object[0]);
            localyticsHandler.getChatSummaryRecorder().cameraCancelled();
            finishAndSetupMainFeed();
            return;
        }
    }

    private void handleSettingsResult()
    {
        if (LbsUtil.getInstance().isLbsAvailable())
        {
            FollowMe.getInstance().activateLbs(-1);
            return;
        } else
        {
            finishAndSetupMainFeed();
            return;
        }
    }

    private void ingestImage(File file)
    {
        if (!file.canRead())
        {
            LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "ingestImage: imageFile=%s does not exist or is not readable", new Object[] {
                file
            });
            showToast(getString(0x7f070091));
            finishAndSetupMainFeed();
        }
        LogUtil.d("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "ingestImage: using imageFile=%s", new Object[] {
            file
        });
        if (!LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            lbsDialog = FindMeUtil.showLBSDisabledDialogFragment(this, 0x7f07008f, new com.weather.Weather.locations.FindMeUtil.LBSDisabledDialogListener() {

                final ChatActivity this$0;

                public void onDialogLaterClick()
                {
                    finishAndSetupMainFeed();
                }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
            });
            lbsDialog.show();
        }
        if ((new FollowMeSnapshot()).getLocation() == null)
        {
            FollowMe.getInstance().activateLbs(-1);
        }
        loadPhoto(photoView, file.getAbsolutePath());
        photoViewAttacher = new PhotoViewAttacher(photoView);
        photoViewAttacher.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        photoViewAttacher.setMaximumScale(5F);
        pictureTime = file.lastModified();
        overlayViewer.update(weatherFacade, pictureTime);
    }

    private static boolean isFirstLaunch()
    {
        boolean flag = false;
        Prefs prefs = ChatPrefs.getInstance();
        if (!prefs.getBoolean(ChatPrefs.Keys.HAS_LAUNCHED, false))
        {
            flag = true;
        }
        if (flag)
        {
            prefs.putBoolean(ChatPrefs.Keys.HAS_LAUNCHED, true);
        }
        return flag;
    }

    private void loadPhoto(ImageView imageview, String s)
    {
        Object obj;
        int i;
        int i1;
        int j1;
        i = imageview.getWidth();
        int j = imageview.getHeight();
        LogUtil.d("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "loadPhoto: view (w x h)=%s x %s, imagePath=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), s
        });
        imageview.destroyDrawingCache();
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        i1 = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        j1 = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        i = 0;
        int k = BitmapUtil.getImageRotationDegrees(s);
        i = k;
_L2:
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int l = Math.min(point.x, point.y);
        int k1 = Math.min(i1 / l, j1 / l);
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = k1;
        obj.inPurgeable = true;
        obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        s = LoggingMetaTags.TWC_WX_PICTURE;
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = ((Bitmap) (obj)).getByteCount();
        }
        LogUtil.d("ChatActivity", s, "loadPhoto: photo (w x h)=%s x %s, rotation=%s, viewScale=%s, byteCount=%s", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(i), Integer.valueOf(k1), Integer.valueOf(l)
        });
        s = ((String) (obj));
        if (i != 0)
        {
            s = new Matrix();
            s.postRotate(i);
            if (obj == null)
            {
                s = null;
            } else
            {
                s = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), s, true);
            }
            obj = LoggingMetaTags.TWC_WX_PICTURE;
            if (s == null)
            {
                i = 0;
            } else
            {
                i = s.getByteCount();
            }
            LogUtil.d("ChatActivity", ((Iterable) (obj)), "after rotation, byteCount=", new Object[] {
                Integer.valueOf(i)
            });
        }
        imageview.setImageBitmap(s);
        return;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void sendAnalytics(Attribute attribute)
    {
        localyticsHandler.getChatSummaryRecorder().photoType();
        localyticsHandler.getChatSummaryRecorder().socialPlatform(attribute);
        localyticsHandler.getChatSummaryRecorder().tag();
    }

    private void setUserMessageAnalytics(int i)
    {
        if (i == 0)
        {
            Analytics.trackState(getString(0x7f0704c4), null);
            localyticsHandler.getChatSummaryRecorder().addMessage();
        }
    }

    private void showTutorial()
    {
        if (tutorialDialog == null)
        {
            tutorialDialog = (new android.app.AlertDialog.Builder(this)).setMessage(0x7f070094).setPositiveButton(0x7f070093, new android.content.DialogInterface.OnClickListener() {

                final ChatActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    takePhoto();
                }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
            }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final ChatActivity this$0;

                public void onCancel(DialogInterface dialoginterface)
                {
                    finishAndSetupMainFeed();
                }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
            }).create();
            tutorialDialog.setCanceledOnTouchOutside(true);
            tutorialDialog.show();
            ((TextView)tutorialDialog.findViewById(0x102000b)).setGravity(17);
            ((Button)tutorialDialog.findViewById(0x1020019)).setTextColor(getResources().getColor(0x7f0b001c));
        }
    }

    private void takePhoto()
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        rawCameraImageFile = getFileForRawCameraImage();
        intent.putExtra("output", Uri.fromFile(rawCameraImageFile));
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            LogUtil.d("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "takePhoto: Saving image to %s", new Object[] {
                rawCameraImageFile
            });
            startActivityForResult(intent, 2);
            return;
        }
        try
        {
            showToast(getString(0x7f070091));
            return;
        }
        catch (IOException ioexception)
        {
            LogUtil.e("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "takePhoto: Unable to create file for image storage", new Object[] {
                ioexception
            });
        }
        showToast(getString(0x7f070091));
        finish();
        return;
    }

    private File updateImage(Bitmap bitmap, int i, ChatOverlayData chatoverlaydata)
    {
        File file;
        try
        {
            file = createPublicImageFile();
            (new ChatImageCreator(this)).updateImage(bitmap, i, chatoverlaydata, file);
            LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "updateImage: bitmap=%s, updatedImageFile=%s", new Object[] {
                bitmap, file
            });
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "updateImage: Unable to create directory for composite image, or failed to save image file", new Object[] {
                bitmap
            });
            showToast(getString(0x7f070090));
            return null;
        }
        return file;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        long l = motionevent.getEventTime();
        if (l < resumeTime)
        {
            LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "Discarded touch event with time earlier than onResume().  eventTime=%s, resumeTime=%s", new Object[] {
                Long.valueOf(l), Long.valueOf(resumeTime)
            });
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onActivityResult: requestCode=%s, resultCode=%s, data=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), intent
        });
        if (i == 1)
        {
            handleSettingsResult();
        } else
        if (i == 2)
        {
            handleCameraResult(j);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        handler = new Handler();
        if (!getPackageManager().hasSystemFeature("android.hardware.camera"))
        {
            LogUtil.w("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "no camera hardware", new Object[0]);
            finishAndSetupMainFeed();
            return;
        }
        setContentView(0x7f030019);
        photoView = (PhotoView)Preconditions.checkNotNull((PhotoView)findViewById(0x7f0d0082));
        photoViewAttacher = new PhotoViewAttacher(photoView);
        photoViewAttacher.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        photoViewAttacher.setMaximumScale(5F);
        overlayViewer = new ChatOverlayViewer(this, findViewById(0x7f0d0081));
        userMessage = (EditText)Preconditions.checkNotNull((EditText)findViewById(0x7f0d008f));
        final ImageView textIcon = new TextWatcher() {

            private int beforeCursorPosition;
            private String text;
            final ChatActivity this$0;
            final int val$lineLimit;

            public void afterTextChanged(Editable editable)
            {
                if (userMessage.getLineCount() > lineLimit)
                {
                    userMessage.removeTextChangedListener(this);
                    userMessage.setText(text);
                    userMessage.setSelection(beforeCursorPosition);
                    userMessage.addTextChangedListener(this);
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                text = charsequence.toString();
                beforeCursorPosition = i;
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = ChatActivity.this;
                lineLimit = i;
                super();
            }
        };
        userMessage.addTextChangedListener(textIcon);
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d0084))).setOnClickListener(new android.view.View.OnClickListener() {

            final ChatActivity this$0;

            public void onClick(View view)
            {
                takePhoto();
            }

            
            {
                this$0 = ChatActivity.this;
                super();
            }
        });
        textIcon = (ImageView)Preconditions.checkNotNull((ImageView)findViewById(0x7f0d0004));
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d0086))).setOnClickListener(new android.view.View.OnClickListener() {

            final ChatActivity this$0;
            final ImageView val$textIcon;

            public void onClick(View view)
            {
                if (userMessage.getVisibility() == 0)
                {
                    textIcon.setImageDrawable(getResources().getDrawable(0x7f02006f));
                    overlayViewer.updateUserMessageVisibility(4);
                    photoView.invalidate();
                    Analytics.trackState(getString(0x7f0704c5), null);
                    return;
                } else
                {
                    textIcon.setImageDrawable(getResources().getDrawable(0x7f020070));
                    overlayViewer.updateUserMessageVisibility(0);
                    Analytics.trackState(getString(0x7f0704c6), null);
                    return;
                }
            }

            
            {
                this$0 = ChatActivity.this;
                textIcon = imageview;
                super();
            }
        });
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d0088))).setOnClickListener(fbmClick);
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d0089))).setOnClickListener(fbmClick);
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d008a))).setOnClickListener(fbClick);
        ((View)Preconditions.checkNotNull(findViewById(0x7f0d008c))).setOnClickListener(shareClick);
        textIcon = getActionBar();
        if (textIcon != null)
        {
            textIcon.setDisplayShowTitleEnabled(true);
            textIcon.setDisplayHomeAsUpEnabled(true);
        }
        if (bundle != null)
        {
            rawCameraImageFile = (File)bundle.getSerializable("com.weather.Weather.chat.ChatActivity.rawCameraFile");
            LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onCreate: savedInstanceState=%s", new Object[] {
                bundle
            });
        }
        if (rawCameraImageFile != null)
        {
            ingestImage(rawCameraImageFile);
            return;
        }
        if (isFirstLaunch())
        {
            showTutorial = true;
            return;
        } else
        {
            takePhoto();
            return;
        }
    }

    protected void onDestroy()
    {
        if (lbsDialog != null && lbsDialog.isShowing())
        {
            lbsDialog.cancel();
            lbsDialog = null;
        }
        super.onDestroy();
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onDestroy: isFinishing=%s", new Object[] {
            Boolean.valueOf(isFinishing())
        });
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onReturnToMainFeed();
            break;
        }
        menuitem = NavUtils.getParentActivityIntent(this);
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "social");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        super.onPause();
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onPause", new Object[0]);
    }

    protected void onResume()
    {
        super.onResume();
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onResume", new Object[0]);
        resumeTime = SystemClock.uptimeMillis() + 300L;
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.CHAT_DETAILS);
        if (showTutorial)
        {
            showTutorial = false;
            showTutorial();
        }
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.CHAT_DETAILS.getName());
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onSaveInstanceState: rawCameraImageFile=%s", new Object[] {
            rawCameraImageFile
        });
        bundle.putSerializable("com.weather.Weather.chat.ChatActivity.rawCameraFile", rawCameraImageFile);
    }

    protected void onStop()
    {
        super.onStop();
        LogUtil.v("ChatActivity", LoggingMetaTags.TWC_WX_PICTURE, "onStop", new Object[0]);
    }

    void showToast(CharSequence charsequence)
    {
        Toast.makeText(this, charsequence, 1).show();
    }

    public void updateWeather(final FollowMeCurrentWeatherFacade change)
    {
        handler.post(new Runnable() {

            final ChatActivity this$0;
            final FollowMeCurrentWeatherFacade val$change;

            public void run()
            {
                weatherFacade = change.currentWeatherFacade;
                overlayViewer.update(weatherFacade, pictureTime);
            }

            
            {
                this$0 = ChatActivity.this;
                change = followmecurrentweatherfacade;
                super();
            }
        });
    }




/*
    static CurrentWeatherFacade access$1102(ChatActivity chatactivity, CurrentWeatherFacade currentweatherfacade)
    {
        chatactivity.weatherFacade = currentweatherfacade;
        return currentweatherfacade;
    }

*/










}
