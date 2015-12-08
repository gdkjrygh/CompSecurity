// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.hockeyapp.android.adapters.MessagesAdapter;
import net.hockeyapp.android.objects.ErrorObject;
import net.hockeyapp.android.objects.Feedback;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import net.hockeyapp.android.tasks.ParseFeedbackTask;
import net.hockeyapp.android.tasks.SendFeedbackTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.views.AttachmentListView;
import net.hockeyapp.android.views.AttachmentView;
import net.hockeyapp.android.views.FeedbackView;

// Referenced classes of package net.hockeyapp.android:
//            FeedbackActivityInterface, Strings, PaintActivity

public class FeedbackActivity extends Activity
    implements FeedbackActivityInterface, android.view.View.OnClickListener
{

    private static final int MAX_ATTACHMENTS_PER_MSG = 3;
    private final int ATTACH_FILE = 2;
    private final int ATTACH_PICTURE = 1;
    private final int DIALOG_ERROR_ID = 0;
    private final int PAINT_IMAGE = 3;
    private Button addAttachmentButton;
    private Button addResponseButton;
    private Context context;
    private EditText emailInput;
    private ErrorObject error;
    private Handler feedbackHandler;
    private ArrayList feedbackMessages;
    private ScrollView feedbackScrollView;
    private boolean feedbackViewInitialized;
    private boolean inSendFeedback;
    private TextView lastUpdatedTextView;
    private MessagesAdapter messagesAdapter;
    private ListView messagesListView;
    private EditText nameInput;
    private Handler parseFeedbackHandler;
    private ParseFeedbackTask parseFeedbackTask;
    private Button refreshButton;
    private Button sendFeedbackButton;
    private SendFeedbackTask sendFeedbackTask;
    private EditText subjectInput;
    private EditText textInput;
    private String token;
    private String url;
    private LinearLayout wrapperLayoutFeedbackAndMessages;

    public FeedbackActivity()
    {
    }

    private boolean addAttachment(int i)
    {
        if (i == 2)
        {
            Intent intent = new Intent();
            intent.setType("*/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(intent, "Select File"), 2);
            return true;
        }
        if (i == 1)
        {
            Intent intent1 = new Intent();
            intent1.setType("image/*");
            intent1.setAction("android.intent.action.GET_CONTENT");
            startActivityForResult(Intent.createChooser(intent1, "Select Picture"), 1);
            return true;
        } else
        {
            return false;
        }
    }

    private void configureAppropriateView()
    {
        token = PrefsUtil.getInstance().getFeedbackTokenFromPrefs(this);
        if (token == null || inSendFeedback)
        {
            configureFeedbackView(false);
            return;
        } else
        {
            configureFeedbackView(true);
            sendFetchFeedback(url, null, null, null, null, null, token, feedbackHandler, true);
            return;
        }
    }

    private void createParseFeedbackTask(String s, String s1)
    {
        parseFeedbackTask = new ParseFeedbackTask(this, s, parseFeedbackHandler, s1);
    }

    private void hideKeyboard()
    {
        if (textInput != null)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(textInput.getWindowToken(), 0);
        }
    }

    private void initFeedbackHandler()
    {
        feedbackHandler = new Handler() {

            final FeedbackActivity this$0;

            public void handleMessage(Message message)
            {
                boolean flag = false;
                error = new ErrorObject();
                if (message != null && message.getData() != null)
                {
                    Object obj = message.getData();
                    message = ((Bundle) (obj)).getString("feedback_response");
                    String s = ((Bundle) (obj)).getString("feedback_status");
                    obj = ((Bundle) (obj)).getString("request_type");
                    if (((String) (obj)).equals("send") && (message == null || Integer.parseInt(s) != 201))
                    {
                        error.setMessage(Strings.get(1036));
                    } else
                    if (((String) (obj)).equals("fetch") && s != null && (Integer.parseInt(s) == 404 || Integer.parseInt(s) == 422))
                    {
                        resetFeedbackView();
                        flag = true;
                    } else
                    if (message != null)
                    {
                        startParseFeedbackTask(message, ((String) (obj)));
                        flag = true;
                    } else
                    {
                        error.setMessage(Strings.get(1037));
                    }
                } else
                {
                    error.setMessage(Strings.get(1036));
                }
                if (!flag)
                {
                    runOnUiThread(new Runnable() {

                        final _cls2 this$1;

                        public void run()
                        {
                            enableDisableSendFeedbackButton(true);
                            showDialog(0);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = FeedbackActivity.this;
                super();
            }
        };
    }

    private void initParseFeedbackHandler()
    {
        parseFeedbackHandler = new Handler() {

            final FeedbackActivity this$0;

            public void handleMessage(Message message)
            {
                boolean flag1 = false;
                error = new ErrorObject();
                boolean flag = flag1;
                if (message != null)
                {
                    flag = flag1;
                    if (message.getData() != null)
                    {
                        message = (FeedbackResponse)message.getData().getSerializable("parse_feedback_response");
                        flag = flag1;
                        if (message != null)
                        {
                            if (message.getStatus().equalsIgnoreCase("success"))
                            {
                                boolean flag2 = true;
                                flag = flag2;
                                if (message.getToken() != null)
                                {
                                    PrefsUtil.getInstance().saveFeedbackTokenToPrefs(context, message.getToken());
                                    loadFeedbackMessages(message);
                                    inSendFeedback = false;
                                    flag = flag2;
                                }
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                if (!flag)
                {
                    runOnUiThread(new Runnable() {

                        final _cls3 this$1;

                        public void run()
                        {
                            showDialog(0);
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                }
                enableDisableSendFeedbackButton(true);
            }

            
            {
                this$0 = FeedbackActivity.this;
                super();
            }
        };
    }

    private void loadFeedbackMessages(final FeedbackResponse feedbackResponse)
    {
        runOnUiThread(new Runnable() {

            final FeedbackActivity this$0;
            final FeedbackResponse val$feedbackResponse;

            public void run()
            {
                configureFeedbackView(true);
                Object obj = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                SimpleDateFormat simpledateformat = new SimpleDateFormat("d MMM h:mm a");
                if (feedbackResponse != null && feedbackResponse.getFeedback() != null && feedbackResponse.getFeedback().getMessages() != null && feedbackResponse.getFeedback().getMessages().size() > 0)
                {
                    feedbackMessages = feedbackResponse.getFeedback().getMessages();
                    Collections.reverse(feedbackMessages);
                    try
                    {
                        obj = ((SimpleDateFormat) (obj)).parse(((FeedbackMessage)feedbackMessages.get(0)).getCreatedAt());
                        lastUpdatedTextView.setText(String.format("Last Updated: %s", new Object[] {
                            simpledateformat.format(((java.util.Date) (obj)))
                        }));
                    }
                    catch (ParseException parseexception)
                    {
                        parseexception.printStackTrace();
                    }
                    if (messagesAdapter == null)
                    {
                        messagesAdapter = new MessagesAdapter(context, feedbackMessages);
                    } else
                    {
                        messagesAdapter.clear();
                        FeedbackMessage feedbackmessage;
                        for (Iterator iterator = feedbackMessages.iterator(); iterator.hasNext(); messagesAdapter.add(feedbackmessage))
                        {
                            feedbackmessage = (FeedbackMessage)iterator.next();
                        }

                        messagesAdapter.notifyDataSetChanged();
                    }
                    messagesListView.setAdapter(messagesAdapter);
                }
            }

            
            {
                this$0 = FeedbackActivity.this;
                feedbackResponse = feedbackresponse;
                super();
            }
        });
    }

    private void resetFeedbackView()
    {
        runOnUiThread(new Runnable() {

            final FeedbackActivity this$0;

            public void run()
            {
                PrefsUtil.getInstance().saveFeedbackTokenToPrefs(FeedbackActivity.this, null);
                PrefsUtil.applyChanges(getSharedPreferences("net.hockeyapp.android.feedback", 0).edit().remove("idLastMessageSend").remove("idLastMessageProcessed"));
                configureFeedbackView(false);
            }

            
            {
                this$0 = FeedbackActivity.this;
                super();
            }
        });
    }

    private void sendFeedback()
    {
        enableDisableSendFeedbackButton(false);
        hideKeyboard();
        String s = PrefsUtil.getInstance().getFeedbackTokenFromPrefs(context);
        String s1 = nameInput.getText().toString().trim();
        String s2 = emailInput.getText().toString().trim();
        String s3 = subjectInput.getText().toString().trim();
        String s4 = textInput.getText().toString().trim();
        if (TextUtils.isEmpty(s3))
        {
            subjectInput.setVisibility(0);
            setError(subjectInput, 1038);
            return;
        }
        if (TextUtils.isEmpty(s1))
        {
            setError(nameInput, 1041);
            return;
        }
        if (TextUtils.isEmpty(s2))
        {
            setError(emailInput, 1042);
            return;
        }
        if (TextUtils.isEmpty(s4))
        {
            setError(textInput, 1043);
            return;
        }
        if (!Util.isValidEmail(s2))
        {
            setError(emailInput, 1039);
            return;
        } else
        {
            PrefsUtil.getInstance().saveNameEmailSubjectToPrefs(context, s1, s2, s3);
            ArrayList arraylist = ((AttachmentListView)findViewById(8209)).getAttachments();
            sendFetchFeedback(url, s1, s2, s3, s4, arraylist, s, feedbackHandler, false);
            return;
        }
    }

    private void sendFetchFeedback(String s, String s1, String s2, String s3, String s4, List list, String s5, 
            Handler handler, boolean flag)
    {
        sendFeedbackTask = new SendFeedbackTask(context, s, s1, s2, s3, s4, list, s5, handler, flag);
        AsyncTaskUtils.execute(sendFeedbackTask);
    }

    private void setError(EditText edittext, int i)
    {
        edittext.setError(Strings.get(i));
        enableDisableSendFeedbackButton(true);
    }

    private void startParseFeedbackTask(String s, String s1)
    {
        createParseFeedbackTask(s, s1);
        AsyncTaskUtils.execute(parseFeedbackTask);
    }

    protected void configureFeedbackView(boolean flag)
    {
        feedbackScrollView = (ScrollView)findViewById(0x20017);
        wrapperLayoutFeedbackAndMessages = (LinearLayout)findViewById(0x20015);
        messagesListView = (ListView)findViewById(0x20016);
        if (flag)
        {
            wrapperLayoutFeedbackAndMessages.setVisibility(0);
            feedbackScrollView.setVisibility(8);
            lastUpdatedTextView = (TextView)findViewById(8192);
            addResponseButton = (Button)findViewById(0x20010);
            addResponseButton.setOnClickListener(this);
            refreshButton = (Button)findViewById(0x20011);
            refreshButton.setOnClickListener(this);
            return;
        }
        wrapperLayoutFeedbackAndMessages.setVisibility(8);
        feedbackScrollView.setVisibility(0);
        nameInput = (EditText)findViewById(8194);
        emailInput = (EditText)findViewById(8196);
        subjectInput = (EditText)findViewById(8198);
        textInput = (EditText)findViewById(8200);
        if (!feedbackViewInitialized)
        {
            String s = PrefsUtil.getInstance().getNameEmailFromPrefs(context);
            if (s != null)
            {
                String as[] = s.split("\\|");
                if (as != null && as.length >= 2)
                {
                    nameInput.setText(as[0]);
                    emailInput.setText(as[1]);
                    if (as.length >= 3)
                    {
                        subjectInput.setText(as[2]);
                        textInput.requestFocus();
                    } else
                    {
                        subjectInput.requestFocus();
                    }
                }
            } else
            {
                nameInput.setText("");
                emailInput.setText("");
                subjectInput.setText("");
                nameInput.requestFocus();
            }
            feedbackViewInitialized = true;
        }
        textInput.setText("");
        if (PrefsUtil.getInstance().getFeedbackTokenFromPrefs(context) != null)
        {
            subjectInput.setVisibility(8);
        } else
        {
            subjectInput.setVisibility(0);
        }
        ((ViewGroup)findViewById(8209)).removeAllViews();
        addAttachmentButton = (Button)findViewById(8208);
        addAttachmentButton.setOnClickListener(this);
        registerForContextMenu(addAttachmentButton);
        sendFeedbackButton = (Button)findViewById(8201);
        sendFeedbackButton.setOnClickListener(this);
    }

    public void enableDisableSendFeedbackButton(boolean flag)
    {
        if (sendFeedbackButton != null)
        {
            sendFeedbackButton.setEnabled(flag);
        }
    }

    public volatile View getLayoutView()
    {
        return getLayoutView();
    }

    public ViewGroup getLayoutView()
    {
        return new FeedbackView(this);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((intent = intent.getData()) != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(8209);
            viewgroup.addView(new AttachmentView(this, viewgroup, intent, true));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getData();
        if (intent != null)
        {
            try
            {
                Intent intent1 = new Intent(this, net/hockeyapp/android/PaintActivity);
                intent1.putExtra("imageUri", intent);
                startActivityForResult(intent1, 3);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.e("HockeyApp", "Paint activity not declared!", intent);
            }
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (i != 3) goto _L1; else goto _L4
_L4:
        intent = (Uri)intent.getParcelableExtra("imageUri");
        if (intent != null)
        {
            ViewGroup viewgroup1 = (ViewGroup)findViewById(8209);
            viewgroup1.addView(new AttachmentView(this, viewgroup1, intent, true));
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 8201: 
            sendFeedback();
            return;

        case 8208: 
            if (((ViewGroup)findViewById(8209)).getChildCount() >= 3)
            {
                Toast.makeText(this, "Only 3 attachments allowed.", 1000).show();
                return;
            } else
            {
                openContextMenu(view);
                return;
            }

        case 131088: 
            configureFeedbackView(false);
            inSendFeedback = true;
            return;

        case 131089: 
            sendFetchFeedback(url, null, null, null, null, null, PrefsUtil.getInstance().getFeedbackTokenFromPrefs(context), feedbackHandler, true);
            return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onContextItemSelected(menuitem);

        case 1: // '\001'
        case 2: // '\002'
            return addAttachment(menuitem.getItemId());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(getLayoutView());
        setTitle(Strings.get(1035));
        context = this;
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 != null)
        {
            url = bundle1.getString("url");
        }
        if (bundle != null)
        {
            feedbackViewInitialized = bundle.getBoolean("feedbackViewInitialized");
            inSendFeedback = bundle.getBoolean("inSendFeedback");
        } else
        {
            inSendFeedback = false;
            feedbackViewInitialized = false;
        }
        ((NotificationManager)getSystemService("notification")).cancel(2);
        initFeedbackHandler();
        initParseFeedbackHandler();
        configureAppropriateView();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        contextmenu.add(0, 2, 0, "Attach File");
        contextmenu.add(0, 1, 0, "Attach Picture");
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(0x1080027).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final FeedbackActivity this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    error = null;
                    dialoginterface.cancel();
                }

            
            {
                this$0 = FeedbackActivity.this;
                super();
            }
            }).create();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (inSendFeedback)
            {
                inSendFeedback = false;
                configureAppropriateView();
            } else
            {
                finish();
            }
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialog = (AlertDialog)dialog;
            break;
        }
        if (error != null)
        {
            dialog.setMessage(error.getMessage());
            return;
        } else
        {
            dialog.setMessage(Strings.get(1040));
            return;
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            ViewGroup viewgroup = (ViewGroup)findViewById(8209);
            for (Iterator iterator = bundle.getParcelableArrayList("attachments").iterator(); iterator.hasNext(); viewgroup.addView(new AttachmentView(this, viewgroup, (Uri)iterator.next(), true))) { }
            feedbackViewInitialized = bundle.getBoolean("feedbackViewInitialized");
        }
        super.onRestoreInstanceState(bundle);
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (sendFeedbackTask != null)
        {
            sendFeedbackTask.detach();
        }
        return sendFeedbackTask;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelableArrayList("attachments", ((AttachmentListView)findViewById(8209)).getAttachments());
        bundle.putBoolean("feedbackViewInitialized", feedbackViewInitialized);
        bundle.putBoolean("inSendFeedback", inSendFeedback);
        super.onSaveInstanceState(bundle);
    }



/*
    static ErrorObject access$002(FeedbackActivity feedbackactivity, ErrorObject errorobject)
    {
        feedbackactivity.error = errorobject;
        return errorobject;
    }

*/






/*
    static boolean access$502(FeedbackActivity feedbackactivity, boolean flag)
    {
        feedbackactivity.inSendFeedback = flag;
        return flag;
    }

*/



/*
    static ArrayList access$602(FeedbackActivity feedbackactivity, ArrayList arraylist)
    {
        feedbackactivity.feedbackMessages = arraylist;
        return arraylist;
    }

*/




/*
    static MessagesAdapter access$802(FeedbackActivity feedbackactivity, MessagesAdapter messagesadapter)
    {
        feedbackactivity.messagesAdapter = messagesadapter;
        return messagesadapter;
    }

*/

}
