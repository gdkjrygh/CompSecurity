// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            HttpMethod, AccessToken, LoggingBehavior, FacebookSdk, 
//            FacebookException, GraphResponse, GraphRequestBatch, GraphRequestAsyncTask, 
//            AccessTokenManager, ProgressNoopOutputStream, ProgressOutputStream, RequestOutputStream

public class GraphRequest
{
    private static class Attachment
    {

        private final GraphRequest request;
        private final Object value;

        public GraphRequest getRequest()
        {
            return request;
        }

        public Object getValue()
        {
            return value;
        }

        public Attachment(GraphRequest graphrequest, Object obj)
        {
            request = graphrequest;
            value = obj;
        }
    }

    public static interface Callback
    {

        public abstract void onCompleted(GraphResponse graphresponse);
    }

    public static interface GraphJSONArrayCallback
    {

        public abstract void onCompleted(JSONArray jsonarray, GraphResponse graphresponse);
    }

    public static interface GraphJSONObjectCallback
    {

        public abstract void onCompleted(JSONObject jsonobject, GraphResponse graphresponse);
    }

    private static interface KeyValueSerializer
    {

        public abstract void writeString(String s, String s1)
            throws IOException;
    }

    public static interface OnProgressCallback
        extends Callback
    {

        public abstract void onProgress(long l, long l1);
    }

    public static class ParcelableResourceWithMimeType
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel)
            {
                return new ParcelableResourceWithMimeType(parcel, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public ParcelableResourceWithMimeType[] newArray(int i)
            {
                return new ParcelableResourceWithMimeType[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final String mimeType;
        private final Parcelable resource;

        public int describeContents()
        {
            return 1;
        }

        public String getMimeType()
        {
            return mimeType;
        }

        public Parcelable getResource()
        {
            return resource;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mimeType);
            parcel.writeParcelable(resource, i);
        }


        private ParcelableResourceWithMimeType(Parcel parcel)
        {
            mimeType = parcel.readString();
            resource = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }

        ParcelableResourceWithMimeType(Parcel parcel, ParcelableResourceWithMimeType parcelableresourcewithmimetype)
        {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable, String s)
        {
            mimeType = s;
            resource = parcelable;
        }
    }

    private static class Serializer
        implements KeyValueSerializer
    {

        private boolean firstWrite;
        private final Logger logger;
        private final OutputStream outputStream;
        private boolean useUrlEncode;

        private RuntimeException getInvalidTypeError()
        {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public transient void write(String s, Object aobj[])
            throws IOException
        {
            if (!useUrlEncode)
            {
                if (firstWrite)
                {
                    outputStream.write("--".getBytes());
                    outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    outputStream.write("\r\n".getBytes());
                    firstWrite = false;
                }
                outputStream.write(String.format(s, aobj).getBytes());
                return;
            } else
            {
                outputStream.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
                return;
            }
        }

        public void writeBitmap(String s, Bitmap bitmap)
            throws IOException
        {
            writeContentDisposition(s, s, "image/png");
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), "<Image>");
            }
        }

        public void writeBytes(String s, byte abyte0[])
            throws IOException
        {
            writeContentDisposition(s, s, "content/unknown");
            outputStream.write(abyte0);
            writeLine("", new Object[0]);
            writeRecordBoundary();
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(abyte0.length)
                }));
            }
        }

        public void writeContentDisposition(String s, String s1, String s2)
            throws IOException
        {
            if (!useUrlEncode)
            {
                write("Content-Disposition: form-data; name=\"%s\"", new Object[] {
                    s
                });
                if (s1 != null)
                {
                    write("; filename=\"%s\"", new Object[] {
                        s1
                    });
                }
                writeLine("", new Object[0]);
                if (s2 != null)
                {
                    writeLine("%s: %s", new Object[] {
                        "Content-Type", s2
                    });
                }
                writeLine("", new Object[0]);
                return;
            } else
            {
                outputStream.write(String.format("%s=", new Object[] {
                    s
                }).getBytes());
                return;
            }
        }

        public void writeContentUri(String s, Uri uri, String s1)
            throws IOException
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "content/unknown";
            }
            writeContentDisposition(s, s, s2);
            s1 = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
            int i = 0;
            if (outputStream instanceof ProgressNoopOutputStream)
            {
                long l = Utility.getContentSize(uri);
                ((ProgressNoopOutputStream)outputStream).addProgress(l);
            } else
            {
                i = 0 + Utility.copyAndCloseInputStream(s1, outputStream);
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public void writeFile(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
            throws IOException
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "content/unknown";
            }
            writeContentDisposition(s, s, s2);
            int i = 0;
            if (outputStream instanceof ProgressNoopOutputStream)
            {
                ((ProgressNoopOutputStream)outputStream).addProgress(parcelfiledescriptor.getStatSize());
            } else
            {
                i = 0 + Utility.copyAndCloseInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor), outputStream);
            }
            writeLine("", new Object[0]);
            writeRecordBoundary();
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(i)
                }));
            }
        }

        public transient void writeLine(String s, Object aobj[])
            throws IOException
        {
            write(s, aobj);
            if (!useUrlEncode)
            {
                write("\r\n", new Object[0]);
            }
        }

        public void writeObject(String s, Object obj, GraphRequest graphrequest)
            throws IOException
        {
            if (outputStream instanceof RequestOutputStream)
            {
                ((RequestOutputStream)outputStream).setCurrentRequest(graphrequest);
            }
            if (GraphRequest.isSupportedParameterType(obj))
            {
                writeString(s, GraphRequest.parameterToString(obj));
                return;
            }
            if (obj instanceof Bitmap)
            {
                writeBitmap(s, (Bitmap)obj);
                return;
            }
            if (obj instanceof byte[])
            {
                writeBytes(s, (byte[])obj);
                return;
            }
            if (obj instanceof Uri)
            {
                writeContentUri(s, (Uri)obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor)
            {
                writeFile(s, (ParcelFileDescriptor)obj, null);
                return;
            }
            if (obj instanceof ParcelableResourceWithMimeType)
            {
                graphrequest = (ParcelableResourceWithMimeType)obj;
                obj = graphrequest.getResource();
                graphrequest = graphrequest.getMimeType();
                if (obj instanceof ParcelFileDescriptor)
                {
                    writeFile(s, (ParcelFileDescriptor)obj, graphrequest);
                    return;
                }
                if (obj instanceof Uri)
                {
                    writeContentUri(s, (Uri)obj, graphrequest);
                    return;
                } else
                {
                    throw getInvalidTypeError();
                }
            } else
            {
                throw getInvalidTypeError();
            }
        }

        public void writeRecordBoundary()
            throws IOException
        {
            if (!useUrlEncode)
            {
                writeLine("--%s", new Object[] {
                    "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
                });
                return;
            } else
            {
                outputStream.write("&".getBytes());
                return;
            }
        }

        public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
            throws IOException, JSONException
        {
            if (outputStream instanceof RequestOutputStream) goto _L2; else goto _L1
_L1:
            writeString(s, jsonarray.toString());
_L4:
            return;
_L2:
            RequestOutputStream requestoutputstream = (RequestOutputStream)outputStream;
            writeContentDisposition(s, null, null);
            write("[", new Object[0]);
            int i = 0;
            collection = collection.iterator();
            do
            {
label0:
                {
                    if (collection.hasNext())
                    {
                        break label0;
                    }
                    write("]", new Object[0]);
                    if (logger != null)
                    {
                        logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                        return;
                    }
                }
                if (true)
                {
                    continue;
                }
                GraphRequest graphrequest = (GraphRequest)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                requestoutputstream.setCurrentRequest(graphrequest);
                if (i > 0)
                {
                    write(",%s", new Object[] {
                        jsonobject.toString()
                    });
                } else
                {
                    write("%s", new Object[] {
                        jsonobject.toString()
                    });
                }
                i++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void writeString(String s, String s1)
            throws IOException
        {
            writeContentDisposition(s, null, null);
            writeLine("%s", new Object[] {
                s1
            });
            writeRecordBoundary();
            if (logger != null)
            {
                logger.appendKeyValue((new StringBuilder("    ")).append(s).toString(), s1);
            }
        }

        public Serializer(OutputStream outputstream, Logger logger1, boolean flag)
        {
            firstWrite = true;
            useUrlEncode = false;
            outputStream = outputstream;
            logger = logger1;
            useUrlEncode = flag;
        }
    }


    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CAPTION_PARAM = "caption";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    public static final String FIELDS_PARAM = "fields";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
    private static final String MY_FRIENDS = "me/friends";
    private static final String MY_PHOTOS = "me/photos";
    private static final String PICTURE_PARAM = "picture";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    public static final String TAG = com/facebook/GraphRequest.getSimpleName();
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private boolean skipClientToken;
    private Object tag;
    private String version;

    public GraphRequest()
    {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s)
    {
        this(accesstoken, s, null, null, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod)
    {
        this(accesstoken, s, bundle, httpmethod, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1)
    {
        this(accesstoken, s, bundle, httpmethod, callback1, null);
    }

    public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1, String s1)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        accessToken = accesstoken;
        graphPath = s;
        version = s1;
        setCallback(callback1);
        setHttpMethod(httpmethod);
        if (bundle != null)
        {
            parameters = new Bundle(bundle);
        } else
        {
            parameters = new Bundle();
        }
        if (version == null)
        {
            version = ServerProtocol.getAPIVersion();
        }
    }

    GraphRequest(AccessToken accesstoken, URL url)
    {
        batchEntryOmitResultOnSuccess = true;
        skipClientToken = false;
        accessToken = accesstoken;
        overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        parameters = new Bundle();
    }

    private void addCommonParameters()
    {
        if (accessToken == null) goto _L2; else goto _L1
_L1:
        if (!parameters.containsKey("access_token"))
        {
            String s = accessToken.getToken();
            Logger.registerAccessToken(s);
            parameters.putString("access_token", s);
        }
_L8:
        parameters.putString("sdk", "android");
        parameters.putString("format", "json");
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) goto _L4; else goto _L3
_L3:
        parameters.putString("debug", "info");
_L6:
        return;
_L2:
        if (!skipClientToken && !parameters.containsKey("access_token"))
        {
            String s1 = FacebookSdk.getApplicationId();
            String s2 = FacebookSdk.getClientToken();
            if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
            {
                s1 = (new StringBuilder(String.valueOf(s1))).append("|").append(s2).toString();
                parameters.putString("access_token", s1);
            } else
            {
                Log.d(TAG, "Warning: Request without access token missing application ID or client token.");
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) goto _L6; else goto _L5
_L5:
        parameters.putString("debug", "warning");
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String appendParametersToBaseUrl(String s)
    {
        android.net.Uri.Builder builder = (new android.net.Uri.Builder()).encodedPath(s);
        Iterator iterator = parameters.keySet().iterator();
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    return builder.toString();
                }
                String s1 = (String)iterator.next();
                Object obj = parameters.get(s1);
                s = ((String) (obj));
                if (obj == null)
                {
                    s = "";
                }
                if (!isSupportedParameterType(s))
                {
                    break;
                }
                builder.appendQueryParameter(s1, parameterToString(s).toString());
            } while (true);
        } while (httpMethod != HttpMethod.GET);
        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
            s.getClass().getSimpleName()
        }));
    }

    private static HttpURLConnection createConnection(URL url)
        throws IOException
    {
        url = (HttpURLConnection)url.openConnection();
        url.setRequestProperty("User-Agent", getUserAgent());
        url.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        url.setChunkedStreamingMode(0);
        return url;
    }

    public static GraphResponse executeAndWait(GraphRequest graphrequest)
    {
        graphrequest = executeBatchAndWait(new GraphRequest[] {
            graphrequest
        });
        if (graphrequest == null || graphrequest.size() != 1)
        {
            throw new FacebookException("invalid state: expected a single response");
        } else
        {
            return (GraphResponse)graphrequest.get(0);
        }
    }

    public static List executeBatchAndWait(GraphRequestBatch graphrequestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(graphrequestbatch, "requests");
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = toHttpConnection(graphrequestbatch);
        }
        catch (Exception exception)
        {
            List list = GraphResponse.constructErrorResponses(graphrequestbatch.getRequests(), null, new FacebookException(exception));
            runCallbacks(graphrequestbatch, list);
            return list;
        }
        return executeConnectionAndWait(httpurlconnection, graphrequestbatch);
    }

    public static List executeBatchAndWait(Collection collection)
    {
        return executeBatchAndWait(new GraphRequestBatch(collection));
    }

    public static transient List executeBatchAndWait(GraphRequest agraphrequest[])
    {
        Validate.notNull(agraphrequest, "requests");
        return executeBatchAndWait(((Collection) (Arrays.asList(agraphrequest))));
    }

    public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphrequestbatch)
    {
        Validate.notEmptyAndContainsNoNulls(graphrequestbatch, "requests");
        graphrequestbatch = new GraphRequestAsyncTask(graphrequestbatch);
        graphrequestbatch.executeOnSettingsExecutor();
        return graphrequestbatch;
    }

    public static GraphRequestAsyncTask executeBatchAsync(Collection collection)
    {
        return executeBatchAsync(new GraphRequestBatch(collection));
    }

    public static transient GraphRequestAsyncTask executeBatchAsync(GraphRequest agraphrequest[])
    {
        Validate.notNull(agraphrequest, "requests");
        return executeBatchAsync(((Collection) (Arrays.asList(agraphrequest))));
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        List list = GraphResponse.fromHttpConnection(httpurlconnection, graphrequestbatch);
        Utility.disconnectQuietly(httpurlconnection);
        int i = graphrequestbatch.size();
        if (i != list.size())
        {
            throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
                Integer.valueOf(list.size()), Integer.valueOf(i)
            }));
        } else
        {
            runCallbacks(graphrequestbatch, list);
            AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
            return list;
        }
    }

    public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, Collection collection)
    {
        return executeConnectionAndWait(httpurlconnection, new GraphRequestBatch(collection));
    }

    public static GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        Validate.notNull(httpurlconnection, "connection");
        httpurlconnection = new GraphRequestAsyncTask(httpurlconnection, graphrequestbatch);
        graphrequestbatch.setCallbackHandler(handler);
        httpurlconnection.executeOnSettingsExecutor();
        return httpurlconnection;
    }

    public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
    {
        return executeConnectionAsync(null, httpurlconnection, graphrequestbatch);
    }

    private static String getBatchAppId(GraphRequestBatch graphrequestbatch)
    {
        if (!Utility.isNullOrEmpty(graphrequestbatch.getBatchApplicationId()))
        {
            return graphrequestbatch.getBatchApplicationId();
        }
        graphrequestbatch = graphrequestbatch.iterator();
        do
        {
            do
            {
                Object obj;
                if (!graphrequestbatch.hasNext())
                {
                    if (!Utility.isNullOrEmpty(defaultBatchApplicationId))
                    {
                        return defaultBatchApplicationId;
                    } else
                    {
                        return FacebookSdk.getApplicationId();
                    }
                }
                obj = ((GraphRequest)graphrequestbatch.next()).accessToken;
            } while (obj == null);
            obj = ((AccessToken) (obj)).getApplicationId();
        } while (obj == null);
        return ((String) (obj));
    }

    public static final String getDefaultBatchApplicationId()
    {
        return defaultBatchApplicationId;
    }

    private static String getDefaultPhotoPathIfNull(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "me/photos";
        }
        return s1;
    }

    private String getGraphPathWithVersion()
    {
        if (versionPattern.matcher(graphPath).matches())
        {
            return graphPath;
        } else
        {
            return String.format("%s/%s", new Object[] {
                version, graphPath
            });
        }
    }

    private static String getMimeContentType()
    {
        return String.format("multipart/form-data; boundary=%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    private static String getUserAgent()
    {
        if (userAgent == null)
        {
            userAgent = String.format("%s.%s", new Object[] {
                "FBAndroidSDK", "4.5.0"
            });
            String s = InternalSettings.getCustomUserAgent();
            if (!Utility.isNullOrEmpty(s))
            {
                userAgent = String.format(Locale.ROOT, "%s/%s", new Object[] {
                    userAgent, s
                });
            }
        }
        return userAgent;
    }

    private static boolean hasOnProgressCallbacks(GraphRequestBatch graphrequestbatch)
    {
        Iterator iterator = graphrequestbatch.getCallbacks().iterator();
_L2:
        if (iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        graphrequestbatch = graphrequestbatch.iterator();
_L4:
        if (!graphrequestbatch.hasNext())
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        if (!((GraphRequestBatch.Callback)iterator.next() instanceof GraphRequestBatch.OnProgressCallback)) goto _L2; else goto _L1
_L1:
        return true;
        if (!(((GraphRequest)graphrequestbatch.next()).getCallback() instanceof OnProgressCallback)) goto _L4; else goto _L3
_L3:
        return true;
    }

    private static boolean isGzipCompressible(GraphRequestBatch graphrequestbatch)
    {
        graphrequestbatch = graphrequestbatch.iterator();
label0:
        do
        {
            if (!graphrequestbatch.hasNext())
            {
                return true;
            }
            GraphRequest graphrequest = (GraphRequest)graphrequestbatch.next();
            Iterator iterator = graphrequest.parameters.keySet().iterator();
            String s;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                s = (String)iterator.next();
            } while (!isSupportedAttachmentType(graphrequest.parameters.get(s)));
            break;
        } while (true);
        return false;
    }

    private static boolean isMeRequest(String s)
    {
        Matcher matcher = versionPattern.matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(1);
        }
        return s.startsWith("me/") || s.startsWith("/me/");
    }

    private static boolean isSupportedAttachmentType(Object obj)
    {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    private static boolean isSupportedParameterType(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, Callback callback1)
    {
        return newCustomAudienceThirdPartyIdRequest(accesstoken, context, null, callback1);
    }

    public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, String s, Callback callback1)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = s;
            if (accesstoken != null)
            {
                s1 = accesstoken.getApplicationId();
            }
        }
        s = s1;
        if (s1 == null)
        {
            s = Utility.getMetadataApplicationId(context);
        }
        if (s == null)
        {
            throw new FacebookException("Facebook App ID cannot be determined");
        }
        s1 = (new StringBuilder(String.valueOf(s))).append("/custom_audience_third_party_id").toString();
        AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
        Bundle bundle = new Bundle();
        if (accesstoken == null)
        {
            if (attributionidentifiers.getAttributionId() != null)
            {
                s = attributionidentifiers.getAttributionId();
            } else
            {
                s = attributionidentifiers.getAndroidAdvertiserId();
            }
            if (attributionidentifiers.getAttributionId() != null)
            {
                bundle.putString("udid", s);
            }
        }
        if (FacebookSdk.getLimitEventAndDataUsage(context) || attributionidentifiers.isTrackingLimited())
        {
            bundle.putString("limit_event_usage", "1");
        }
        return new GraphRequest(accesstoken, s1, bundle, HttpMethod.GET, callback1);
    }

    public static GraphRequest newDeleteObjectRequest(AccessToken accesstoken, String s, Callback callback1)
    {
        return new GraphRequest(accesstoken, s, null, HttpMethod.DELETE, callback1);
    }

    public static GraphRequest newGraphPathRequest(AccessToken accesstoken, String s, Callback callback1)
    {
        return new GraphRequest(accesstoken, s, null, null, callback1);
    }

    public static GraphRequest newMeRequest(AccessToken accesstoken, final GraphJSONObjectCallback callback)
    {
        return new GraphRequest(accesstoken, "me", null, null, new Callback() {

            private final GraphJSONObjectCallback val$callback;

            public void onCompleted(GraphResponse graphresponse)
            {
                if (callback != null)
                {
                    callback.onCompleted(graphresponse.getJSONObject(), graphresponse);
                }
            }

            
            {
                callback = graphjsonobjectcallback;
                super();
            }
        });
    }

    public static GraphRequest newMyFriendsRequest(AccessToken accesstoken, final GraphJSONArrayCallback callback)
    {
        return new GraphRequest(accesstoken, "me/friends", null, null, new Callback() {

            private final GraphJSONArrayCallback val$callback;

            public void onCompleted(GraphResponse graphresponse)
            {
                if (callback != null)
                {
                    Object obj = graphresponse.getJSONObject();
                    if (obj != null)
                    {
                        obj = ((JSONObject) (obj)).optJSONArray("data");
                    } else
                    {
                        obj = null;
                    }
                    callback.onCompleted(((JSONArray) (obj)), graphresponse);
                }
            }

            
            {
                callback = graphjsonarraycallback;
                super();
            }
        });
    }

    public static GraphRequest newPlacesSearchRequest(AccessToken accesstoken, Location location, int i, int j, String s, final GraphJSONArrayCallback callback)
    {
        if (location == null && Utility.isNullOrEmpty(s))
        {
            throw new FacebookException("Either location or searchText must be specified.");
        }
        Bundle bundle = new Bundle(5);
        bundle.putString("type", "place");
        bundle.putInt("limit", j);
        if (location != null)
        {
            bundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] {
                Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
            }));
            bundle.putInt("distance", i);
        }
        if (!Utility.isNullOrEmpty(s))
        {
            bundle.putString("q", s);
        }
        location = new Callback() {

            private final GraphJSONArrayCallback val$callback;

            public void onCompleted(GraphResponse graphresponse)
            {
                if (callback != null)
                {
                    Object obj = graphresponse.getJSONObject();
                    if (obj != null)
                    {
                        obj = ((JSONObject) (obj)).optJSONArray("data");
                    } else
                    {
                        obj = null;
                    }
                    callback.onCompleted(((JSONArray) (obj)), graphresponse);
                }
            }

            
            {
                callback = graphjsonarraycallback;
                super();
            }
        };
        return new GraphRequest(accesstoken, "search", bundle, HttpMethod.GET, location);
    }

    public static GraphRequest newPostRequest(AccessToken accesstoken, String s, JSONObject jsonobject, Callback callback1)
    {
        accesstoken = new GraphRequest(accesstoken, s, null, HttpMethod.POST, callback1);
        accesstoken.setGraphObject(jsonobject);
        return accesstoken;
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Bitmap bitmap, String s1, Bundle bundle, Callback callback1)
    {
        s = getDefaultPhotoPathIfNull(s);
        Bundle bundle1 = new Bundle();
        if (bundle != null)
        {
            bundle1.putAll(bundle);
        }
        bundle1.putParcelable("picture", bitmap);
        if (s1 != null && !s1.isEmpty())
        {
            bundle1.putString("caption", s1);
        }
        return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Uri uri, String s1, Bundle bundle, Callback callback1)
        throws FileNotFoundException
    {
        s = getDefaultPhotoPathIfNull(s);
        if (Utility.isFileUri(uri))
        {
            return newUploadPhotoRequest(accesstoken, s, new File(uri.getPath()), s1, bundle, callback1);
        }
        if (!Utility.isContentUri(uri))
        {
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        }
        s1 = new Bundle();
        if (bundle != null)
        {
            s1.putAll(bundle);
        }
        s1.putParcelable("picture", uri);
        return new GraphRequest(accesstoken, s, s1, HttpMethod.POST, callback1);
    }

    public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, File file, String s1, Bundle bundle, Callback callback1)
        throws FileNotFoundException
    {
        s = getDefaultPhotoPathIfNull(s);
        file = ParcelFileDescriptor.open(file, 0x10000000);
        Bundle bundle1 = new Bundle();
        if (bundle != null)
        {
            bundle1.putAll(bundle);
        }
        bundle1.putParcelable("picture", file);
        if (s1 != null && !s1.isEmpty())
        {
            bundle1.putString("caption", s1);
        }
        return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
    }

    private static String parameterToString(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number))
        {
            return obj.toString();
        }
        if (obj instanceof Date)
        {
            return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(obj);
        } else
        {
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
    }

    private static void processGraphObject(JSONObject jsonobject, String s, KeyValueSerializer keyvalueserializer)
        throws IOException
    {
        int i = 0;
        if (isMeRequest(s))
        {
            i = s.indexOf(":");
            int j = s.indexOf("?");
            if (i > 3 && (j == -1 || i < j))
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
        s = jsonobject.keys();
        do
        {
            if (!s.hasNext())
            {
                return;
            }
            String s1 = (String)s.next();
            Object obj = jsonobject.opt(s1);
            boolean flag;
            if (i != 0 && s1.equalsIgnoreCase("image"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            processGraphObjectProperty(s1, obj, keyvalueserializer, flag);
        } while (true);
    }

    private static void processGraphObjectProperty(String s, Object obj, KeyValueSerializer keyvalueserializer, boolean flag)
        throws IOException
    {
        Object obj1 = obj.getClass();
        if (!org/json/JSONObject.isAssignableFrom(((Class) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = (JSONObject)obj;
        if (!flag) goto _L4; else goto _L3
_L3:
        obj1 = ((JSONObject) (obj)).keys();
_L10:
        if (((Iterator) (obj1)).hasNext()) goto _L6; else goto _L5
_L5:
        return;
_L6:
        String s1 = (String)((Iterator) (obj1)).next();
        processGraphObjectProperty(String.format("%s[%s]", new Object[] {
            s, s1
        }), ((JSONObject) (obj)).opt(s1), keyvalueserializer, flag);
        continue; /* Loop/switch isn't completed */
_L4:
        if (((JSONObject) (obj)).has("id"))
        {
            processGraphObjectProperty(s, ((JSONObject) (obj)).optString("id"), keyvalueserializer, flag);
            return;
        }
        if (((JSONObject) (obj)).has("url"))
        {
            processGraphObjectProperty(s, ((JSONObject) (obj)).optString("url"), keyvalueserializer, flag);
            return;
        }
        if (((JSONObject) (obj)).has("fbsdk:create_object"))
        {
            processGraphObjectProperty(s, ((JSONObject) (obj)).toString(), keyvalueserializer, flag);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!org/json/JSONArray.isAssignableFrom(((Class) (obj1))))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONArray)obj;
        int j = ((JSONArray) (obj)).length();
        int i = 0;
        while (i < j) 
        {
            processGraphObjectProperty(String.format(Locale.ROOT, "%s[%d]", new Object[] {
                s, Integer.valueOf(i)
            }), ((JSONArray) (obj)).opt(i), keyvalueserializer, flag);
            i++;
        }
        if (true) goto _L5; else goto _L7
_L7:
        if (java/lang/String.isAssignableFrom(((Class) (obj1))) || java/lang/Number.isAssignableFrom(((Class) (obj1))) || java/lang/Boolean.isAssignableFrom(((Class) (obj1))))
        {
            keyvalueserializer.writeString(s, obj.toString());
            return;
        }
        if (!java/util/Date.isAssignableFrom(((Class) (obj1)))) goto _L5; else goto _L8
_L8:
        obj = (Date)obj;
        keyvalueserializer.writeString(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static void processRequest(GraphRequestBatch graphrequestbatch, Logger logger, int i, URL url, OutputStream outputstream, boolean flag)
        throws IOException, JSONException
    {
        outputstream = new Serializer(outputstream, logger, flag);
        if (i == 1)
        {
            graphrequestbatch = graphrequestbatch.get(0);
            HashMap hashmap = new HashMap();
            Iterator iterator = ((GraphRequest) (graphrequestbatch)).parameters.keySet().iterator();
            do
            {
                String s;
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        if (logger != null)
                        {
                            logger.append("  Parameters:\n");
                        }
                        serializeParameters(((GraphRequest) (graphrequestbatch)).parameters, outputstream, graphrequestbatch);
                        if (logger != null)
                        {
                            logger.append("  Attachments:\n");
                        }
                        serializeAttachments(hashmap, outputstream);
                        if (((GraphRequest) (graphrequestbatch)).graphObject != null)
                        {
                            processGraphObject(((GraphRequest) (graphrequestbatch)).graphObject, url.getPath(), outputstream);
                        }
                        return;
                    }
                    s = (String)iterator.next();
                    obj = ((GraphRequest) (graphrequestbatch)).parameters.get(s);
                } while (!isSupportedAttachmentType(obj));
                hashmap.put(s, new Attachment(graphrequestbatch, obj));
            } while (true);
        }
        url = getBatchAppId(graphrequestbatch);
        if (Utility.isNullOrEmpty(url))
        {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        outputstream.writeString("batch_app_id", url);
        url = new HashMap();
        serializeRequestsAsJSON(outputstream, graphrequestbatch, url);
        if (logger != null)
        {
            logger.append("  Attachments:\n");
        }
        serializeAttachments(url, outputstream);
    }

    static void runCallbacks(final GraphRequestBatch requests, List list)
    {
        int j = requests.size();
        final ArrayList callbacks = new ArrayList();
        int i = 0;
        do
        {
            if (i >= j)
            {
                if (callbacks.size() > 0)
                {
                    list = new Runnable() {

                        private final ArrayList val$callbacks;
                        private final GraphRequestBatch val$requests;

                        public void run()
                        {
                            Iterator iterator = callbacks.iterator();
_L3:
                            if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
                            iterator = requests.getCallbacks().iterator();
_L4:
                            if (!iterator.hasNext())
                            {
                                return;
                            }
                            break MISSING_BLOCK_LABEL_72;
_L2:
                            Pair pair = (Pair)iterator.next();
                            ((Callback)pair.first).onCompleted((GraphResponse)pair.second);
                              goto _L3
                            ((GraphRequestBatch.Callback)iterator.next()).onBatchCompleted(requests);
                              goto _L4
                        }

            
            {
                callbacks = arraylist;
                requests = graphrequestbatch;
                super();
            }
                    };
                    requests = requests.getCallbackHandler();
                    if (requests != null)
                    {
                        break;
                    }
                    list.run();
                }
                return;
            }
            GraphRequest graphrequest = requests.get(i);
            if (graphrequest.callback != null)
            {
                callbacks.add(new Pair(graphrequest.callback, (GraphResponse)list.get(i)));
            }
            i++;
        } while (true);
        requests.post(list);
    }

    private static void serializeAttachments(Map map, Serializer serializer)
        throws IOException
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            String s;
            Attachment attachment;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                s = (String)iterator.next();
                attachment = (Attachment)map.get(s);
            } while (!isSupportedAttachmentType(attachment.getValue()));
            serializer.writeObject(s, attachment.getValue(), attachment.getRequest());
        } while (true);
    }

    private static void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphrequest)
        throws IOException
    {
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            String s;
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                s = (String)iterator.next();
                obj = bundle.get(s);
            } while (!isSupportedParameterType(obj));
            serializer.writeObject(s, obj, graphrequest);
        } while (true);
    }

    private static void serializeRequestsAsJSON(Serializer serializer, Collection collection, Map map)
        throws JSONException, IOException
    {
        JSONArray jsonarray = new JSONArray();
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                serializer.writeRequestsAsJson("batch", jsonarray, collection);
                return;
            }
            ((GraphRequest)iterator.next()).serializeToBatch(jsonarray, map);
        } while (true);
    }

    private void serializeToBatch(JSONArray jsonarray, final Map keysAndValues)
        throws JSONException, IOException
    {
        JSONObject jsonobject = new JSONObject();
        if (batchEntryName != null)
        {
            jsonobject.put("name", batchEntryName);
            jsonobject.put("omit_response_on_success", batchEntryOmitResultOnSuccess);
        }
        if (batchEntryDependsOn != null)
        {
            jsonobject.put("depends_on", batchEntryDependsOn);
        }
        String s = getUrlForBatchedRequest();
        jsonobject.put("relative_url", s);
        jsonobject.put("method", httpMethod);
        if (accessToken != null)
        {
            Logger.registerAccessToken(accessToken.getToken());
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = parameters.keySet().iterator();
        do
        {
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    if (!arraylist.isEmpty())
                    {
                        jsonobject.put("attached_files", TextUtils.join(",", arraylist));
                    }
                    if (graphObject != null)
                    {
                        keysAndValues = new ArrayList();
                        processGraphObject(graphObject, s, new KeyValueSerializer() {

                            final GraphRequest this$0;
                            private final ArrayList val$keysAndValues;

                            public void writeString(String s2, String s3)
                                throws IOException
                            {
                                keysAndValues.add(String.format(Locale.US, "%s=%s", new Object[] {
                                    s2, URLEncoder.encode(s3, "UTF-8")
                                }));
                            }

            
            {
                this$0 = GraphRequest.this;
                keysAndValues = arraylist;
                super();
            }
                        });
                        jsonobject.put("body", TextUtils.join("&", keysAndValues));
                    }
                    jsonarray.put(jsonobject);
                    return;
                }
                obj = (String)iterator.next();
                obj = parameters.get(((String) (obj)));
            } while (!isSupportedAttachmentType(obj));
            String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
                "file", Integer.valueOf(keysAndValues.size())
            });
            arraylist.add(s1);
            keysAndValues.put(s1, new Attachment(this, obj));
        } while (true);
    }

    static final void serializeToUrlConnection(GraphRequestBatch graphrequestbatch, HttpURLConnection httpurlconnection)
        throws IOException, JSONException
    {
        Object obj;
        Logger logger;
        URL url;
        int j;
        boolean flag1;
        logger = new Logger(LoggingBehavior.REQUESTS, "Request");
        j = graphrequestbatch.size();
        flag1 = isGzipCompressible(graphrequestbatch);
        boolean flag;
        if (j == 1)
        {
            obj = graphrequestbatch.get(0).httpMethod;
        } else
        {
            obj = HttpMethod.POST;
        }
        httpurlconnection.setRequestMethod(((HttpMethod) (obj)).name());
        setConnectionContentType(httpurlconnection, flag1);
        url = httpurlconnection.getURL();
        logger.append("Request:\n");
        logger.appendKeyValue("Id", graphrequestbatch.getId());
        logger.appendKeyValue("URL", url);
        logger.appendKeyValue("Method", httpurlconnection.getRequestMethod());
        logger.appendKeyValue("User-Agent", httpurlconnection.getRequestProperty("User-Agent"));
        logger.appendKeyValue("Content-Type", httpurlconnection.getRequestProperty("Content-Type"));
        httpurlconnection.setConnectTimeout(graphrequestbatch.getTimeout());
        httpurlconnection.setReadTimeout(graphrequestbatch.getTimeout());
        if (obj == HttpMethod.POST)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            logger.log();
            return;
        }
        httpurlconnection.setDoOutput(true);
        obj = null;
        Object obj1 = new BufferedOutputStream(httpurlconnection.getOutputStream());
        httpurlconnection = ((HttpURLConnection) (obj1));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = obj1;
        httpurlconnection = new GZIPOutputStream(((OutputStream) (obj1)));
        obj = httpurlconnection;
        if (!hasOnProgressCallbacks(graphrequestbatch))
        {
            break MISSING_BLOCK_LABEL_281;
        }
        obj = httpurlconnection;
        obj1 = new ProgressNoopOutputStream(graphrequestbatch.getCallbackHandler());
        obj = httpurlconnection;
        processRequest(graphrequestbatch, null, j, url, ((OutputStream) (obj1)), flag1);
        obj = httpurlconnection;
        int i = ((ProgressNoopOutputStream) (obj1)).getMaxProgress();
        obj = httpurlconnection;
        httpurlconnection = new ProgressOutputStream(httpurlconnection, graphrequestbatch, ((ProgressNoopOutputStream) (obj1)).getProgressMap(), i);
        obj = httpurlconnection;
        processRequest(graphrequestbatch, logger, j, url, httpurlconnection, flag1);
        if (httpurlconnection != null)
        {
            httpurlconnection.close();
        }
        logger.log();
        return;
        graphrequestbatch;
_L2:
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        throw graphrequestbatch;
        graphrequestbatch;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void setConnectionContentType(HttpURLConnection httpurlconnection, boolean flag)
    {
        if (flag)
        {
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        } else
        {
            httpurlconnection.setRequestProperty("Content-Type", getMimeContentType());
            return;
        }
    }

    public static final void setDefaultBatchApplicationId(String s)
    {
        defaultBatchApplicationId = s;
    }

    static final boolean shouldWarnOnMissingFieldsParam(GraphRequest graphrequest)
    {
        String s = graphrequest.getVersion();
        if (!Utility.isNullOrEmpty(s))
        {
            graphrequest = s;
            if (s.startsWith("v"))
            {
                graphrequest = s.substring(1);
            }
            graphrequest = graphrequest.split("\\.");
            if ((graphrequest.length < 2 || Integer.parseInt(graphrequest[0]) <= 2) && (Integer.parseInt(graphrequest[0]) < 2 || Integer.parseInt(graphrequest[1]) < 4))
            {
                return false;
            }
        }
        return true;
    }

    public static HttpURLConnection toHttpConnection(GraphRequestBatch graphrequestbatch)
    {
        validateFieldsParamForGetRequests(graphrequestbatch);
        Object obj;
        if (graphrequestbatch.size() != 1)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = new URL(graphrequestbatch.get(0).getUrlForSingleRequest());
_L1:
        try
        {
            obj = createConnection(((URL) (obj)));
            serializeToUrlConnection(graphrequestbatch, ((HttpURLConnection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct request body", graphrequestbatch);
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct request body", graphrequestbatch);
        }
        return ((HttpURLConnection) (obj));
        try
        {
            obj = new URL(ServerProtocol.getGraphUrlBase());
        }
        // Misplaced declaration of an exception variable
        catch (GraphRequestBatch graphrequestbatch)
        {
            throw new FacebookException("could not construct URL for request", graphrequestbatch);
        }
          goto _L1
    }

    public static HttpURLConnection toHttpConnection(Collection collection)
    {
        Validate.notEmptyAndContainsNoNulls(collection, "requests");
        return toHttpConnection(new GraphRequestBatch(collection));
    }

    public static transient HttpURLConnection toHttpConnection(GraphRequest agraphrequest[])
    {
        return toHttpConnection(((Collection) (Arrays.asList(agraphrequest))));
    }

    static final void validateFieldsParamForGetRequests(GraphRequestBatch graphrequestbatch)
    {
        graphrequestbatch = graphrequestbatch.iterator();
        do
        {
            GraphRequest graphrequest;
            Bundle bundle;
            do
            {
                do
                {
                    if (!graphrequestbatch.hasNext())
                    {
                        return;
                    }
                    graphrequest = (GraphRequest)graphrequestbatch.next();
                } while (!HttpMethod.GET.equals(graphrequest.getHttpMethod()) || !shouldWarnOnMissingFieldsParam(graphrequest));
                bundle = graphrequest.getParameters();
            } while (bundle.containsKey("fields") && !Utility.isNullOrEmpty(bundle.getString("fields")));
            Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] {
                graphrequest.getGraphPath()
            });
        } while (true);
    }

    public final GraphResponse executeAndWait()
    {
        return executeAndWait(this);
    }

    public final GraphRequestAsyncTask executeAsync()
    {
        return executeBatchAsync(new GraphRequest[] {
            this
        });
    }

    public final AccessToken getAccessToken()
    {
        return accessToken;
    }

    public final String getBatchEntryDependsOn()
    {
        return batchEntryDependsOn;
    }

    public final String getBatchEntryName()
    {
        return batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess()
    {
        return batchEntryOmitResultOnSuccess;
    }

    public final Callback getCallback()
    {
        return callback;
    }

    public final JSONObject getGraphObject()
    {
        return graphObject;
    }

    public final String getGraphPath()
    {
        return graphPath;
    }

    public final HttpMethod getHttpMethod()
    {
        return httpMethod;
    }

    public final Bundle getParameters()
    {
        return parameters;
    }

    public final Object getTag()
    {
        return tag;
    }

    final String getUrlForBatchedRequest()
    {
        if (overriddenURL != null)
        {
            throw new FacebookException("Can't override URL for a batch request");
        } else
        {
            String s = getGraphPathWithVersion();
            addCommonParameters();
            return appendParametersToBaseUrl(s);
        }
    }

    final String getUrlForSingleRequest()
    {
        if (overriddenURL != null)
        {
            return overriddenURL.toString();
        }
        String s;
        if (getHttpMethod() == HttpMethod.POST && graphPath != null && graphPath.endsWith("/videos"))
        {
            s = ServerProtocol.getGraphVideoUrlBase();
        } else
        {
            s = ServerProtocol.getGraphUrlBase();
        }
        s = String.format("%s/%s", new Object[] {
            s, getGraphPathWithVersion()
        });
        addCommonParameters();
        return appendParametersToBaseUrl(s);
    }

    public final String getVersion()
    {
        return version;
    }

    public final void setAccessToken(AccessToken accesstoken)
    {
        accessToken = accesstoken;
    }

    public final void setBatchEntryDependsOn(String s)
    {
        batchEntryDependsOn = s;
    }

    public final void setBatchEntryName(String s)
    {
        batchEntryName = s;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean flag)
    {
        batchEntryOmitResultOnSuccess = flag;
    }

    public final void setCallback(final Callback callback)
    {
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
        {
            this.callback = new Callback() {

                final GraphRequest this$0;
                private final Callback val$callback;

                public void onCompleted(GraphResponse graphresponse)
                {
                    JSONArray jsonarray;
                    int i;
                    JSONObject jsonobject = graphresponse.getJSONObject();
                    if (jsonobject != null)
                    {
                        jsonobject = jsonobject.optJSONObject("__debug__");
                    } else
                    {
                        jsonobject = null;
                    }
                    if (jsonobject != null)
                    {
                        jsonarray = jsonobject.optJSONArray("messages");
                    } else
                    {
                        jsonarray = null;
                    }
                    if (jsonarray == null) goto _L2; else goto _L1
_L1:
                    i = 0;
_L5:
                    if (i < jsonarray.length()) goto _L3; else goto _L2
_L2:
                    if (callback != null)
                    {
                        callback.onCompleted(graphresponse);
                    }
                    return;
_L3:
                    Object obj = jsonarray.optJSONObject(i);
                    String s;
                    String s1;
                    if (obj != null)
                    {
                        s = ((JSONObject) (obj)).optString("message");
                    } else
                    {
                        s = null;
                    }
                    if (obj != null)
                    {
                        s1 = ((JSONObject) (obj)).optString("type");
                    } else
                    {
                        s1 = null;
                    }
                    if (obj != null)
                    {
                        obj = ((JSONObject) (obj)).optString("link");
                    } else
                    {
                        obj = null;
                    }
                    if (s != null && s1 != null)
                    {
                        LoggingBehavior loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (s1.equals("warning"))
                        {
                            loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        s1 = s;
                        if (!Utility.isNullOrEmpty(((String) (obj))))
                        {
                            s1 = (new StringBuilder(String.valueOf(s))).append(" Link: ").append(((String) (obj))).toString();
                        }
                        Logger.log(loggingbehavior, GraphRequest.TAG, s1);
                    }
                    i++;
                    if (true) goto _L5; else goto _L4
_L4:
                }

            
            {
                this$0 = GraphRequest.this;
                callback = callback1;
                super();
            }
            };
            return;
        } else
        {
            this.callback = callback;
            return;
        }
    }

    public final void setGraphObject(JSONObject jsonobject)
    {
        graphObject = jsonobject;
    }

    public final void setGraphPath(String s)
    {
        graphPath = s;
    }

    public final void setHttpMethod(HttpMethod httpmethod)
    {
        if (overriddenURL != null && httpmethod != HttpMethod.GET)
        {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpmethod == null)
        {
            httpmethod = HttpMethod.GET;
        }
        httpMethod = httpmethod;
    }

    public final void setParameters(Bundle bundle)
    {
        parameters = bundle;
    }

    public final void setSkipClientToken(boolean flag)
    {
        skipClientToken = flag;
    }

    public final void setTag(Object obj)
    {
        tag = obj;
    }

    public final void setVersion(String s)
    {
        version = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("{Request: ").append(" accessToken: ");
        Object obj;
        if (accessToken == null)
        {
            obj = "null";
        } else
        {
            obj = accessToken;
        }
        return stringbuilder.append(obj).append(", graphPath: ").append(graphPath).append(", graphObject: ").append(graphObject).append(", httpMethod: ").append(httpMethod).append(", parameters: ").append(parameters).append("}").toString();
    }



}
