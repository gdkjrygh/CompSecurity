// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.debug.hv;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.view.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ViewServer
    implements Runnable
{
    private static class NoopViewServer extends ViewServer
    {

        public void addWindow(Activity activity)
        {
        }

        public void addWindow(View view, String s)
        {
        }

        public boolean isRunning()
        {
            return false;
        }

        public void removeWindow(Activity activity)
        {
        }

        public void removeWindow(View view)
        {
        }

        public void run()
        {
        }

        public void setFocusedWindow(Activity activity)
        {
        }

        public void setFocusedWindow(View view)
        {
        }

        public boolean start()
            throws IOException
        {
            return false;
        }

        public boolean stop()
        {
            return false;
        }

        private NoopViewServer()
        {
        }

    }

    private static class UncloseableOutputStream extends OutputStream
    {

        private final OutputStream mStream;

        public void close()
            throws IOException
        {
        }

        public boolean equals(Object obj)
        {
            return mStream.equals(obj);
        }

        public void flush()
            throws IOException
        {
            mStream.flush();
        }

        public int hashCode()
        {
            return mStream.hashCode();
        }

        public String toString()
        {
            return mStream.toString();
        }

        public void write(int i)
            throws IOException
        {
            mStream.write(i);
        }

        public void write(byte abyte0[])
            throws IOException
        {
            mStream.write(abyte0);
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            mStream.write(abyte0, i, j);
        }

        UncloseableOutputStream(OutputStream outputstream)
        {
            mStream = outputstream;
        }
    }

    private class ViewServerWorker
        implements Runnable, WindowListener
    {

        private Socket mClient;
        private final Object mLock[] = new Object[0];
        private boolean mNeedFocusedWindowUpdate;
        private boolean mNeedWindowListUpdate;
        final ViewServer this$0;

        private View findWindow(int i)
        {
            if (i != -1)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            mWindowsLock.readLock().lock();
            Object obj = mFocusedWindow;
            mWindowsLock.readLock().unlock();
            return ((View) (obj));
            Exception exception;
            exception;
            mWindowsLock.readLock().unlock();
            throw exception;
            mWindowsLock.readLock().lock();
            exception = mWindows.entrySet().iterator();
            java.util.Map.Entry entry;
            do
            {
                if (!exception.hasNext())
                {
                    break MISSING_BLOCK_LABEL_143;
                }
                entry = (java.util.Map.Entry)exception.next();
            } while (System.identityHashCode(entry.getKey()) != i);
            exception = (View)entry.getKey();
            mWindowsLock.readLock().unlock();
            return exception;
            mWindowsLock.readLock().unlock();
            return null;
            exception;
            mWindowsLock.readLock().unlock();
            throw exception;
        }

        private boolean getFocusedWindow(Socket socket)
        {
            Object obj;
            Object obj1;
            boolean flag;
            flag = true;
            obj1 = null;
            obj = null;
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            mFocusLock.readLock().lock();
            obj = mFocusedWindow;
            mFocusLock.readLock().unlock();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            mWindowsLock.readLock().lock();
            obj1 = (String)mWindows.get(mFocusedWindow);
            mWindowsLock.readLock().unlock();
            socket.write(Integer.toHexString(System.identityHashCode(obj)));
            socket.write(32);
            socket.append(((CharSequence) (obj1)));
            socket.write(10);
            socket.flush();
            if (socket == null)
            {
                break MISSING_BLOCK_LABEL_241;
            }
            try
            {
                socket.close();
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                return false;
            }
            return flag;
            obj;
            try
            {
                mFocusLock.readLock().unlock();
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                obj = socket;
            }
_L4:
            flag = false;
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return false;
            } else
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj;
            mWindowsLock.readLock().unlock();
            throw obj;
            socket = ((Socket) (obj1));
_L2:
            if (obj != null)
            {
                try
                {
                    ((BufferedWriter) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw socket;
            socket;
            obj = obj1;
            if (true) goto _L2; else goto _L1
_L1:
            socket;
            socket = ((Socket) (obj));
            if (true) goto _L4; else goto _L3
_L3:
            return true;
        }

        private boolean listWindows(Socket socket)
        {
            Object obj;
            Object obj1;
            obj = null;
            obj1 = null;
            mWindowsLock.readLock().lock();
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
            for (obj = mWindows.entrySet().iterator(); ((Iterator) (obj)).hasNext(); socket.write(10))
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                socket.write(Integer.toHexString(System.identityHashCode(((java.util.Map.Entry) (obj1)).getKey())));
                socket.write(32);
                socket.append((CharSequence)((java.util.Map.Entry) (obj1)).getValue());
            }

              goto _L1
            obj;
_L5:
            mWindowsLock.readLock().unlock();
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
            }
            return false;
_L1:
            socket.write("DONE.\n");
            socket.flush();
            mWindowsLock.readLock().unlock();
            if (socket != null)
            {
                try
                {
                    socket.close();
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return false;
                }
                return true;
            } else
            {
                return true;
            }
            socket;
_L3:
            mWindowsLock.readLock().unlock();
            if (obj != null)
            {
                try
                {
                    ((BufferedWriter) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw socket;
            obj1;
            obj = socket;
            socket = ((Socket) (obj1));
            if (true) goto _L3; else goto _L2
_L2:
            socket;
            socket = ((Socket) (obj1));
            if (true) goto _L5; else goto _L4
_L4:
        }

        private boolean windowCommand(Socket socket, String s, String s1)
        {
            Object obj;
            Object obj1;
            Socket socket1;
            Object obj2;
            Object obj3;
            boolean flag1;
            flag1 = true;
            obj2 = null;
            obj3 = null;
            socket1 = null;
            obj1 = s1;
            obj = obj3;
            int j = s1.indexOf(' ');
            int i;
            i = j;
            if (j != -1)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            obj1 = s1;
            obj = obj3;
            i = s1.length();
            obj1 = s1;
            obj = obj3;
            j = (int)Long.parseLong(s1.substring(0, i), 16);
            obj1 = s1;
            obj = obj3;
            if (i >= s1.length()) goto _L2; else goto _L1
_L1:
            obj1 = s1;
            obj = obj3;
            s1 = s1.substring(i + 1);
_L4:
            obj1 = s1;
            obj = obj3;
            View view = findWindow(j);
            Method method;
            boolean flag;
            if (view == null)
            {
                if (false)
                {
                    try
                    {
                        throw new NullPointerException();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Socket socket)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            break; /* Loop/switch isn't completed */
_L2:
            s1 = "";
            if (true) goto _L4; else goto _L3
_L3:
            obj1 = s1;
            obj = obj3;
            method = android/view/ViewDebug.getDeclaredMethod("dispatchCommand", new Class[] {
                android/view/View, java/lang/String, java/lang/String, java/io/OutputStream
            });
            obj1 = s1;
            obj = obj3;
            method.setAccessible(true);
            obj1 = s1;
            obj = obj3;
            method.invoke(null, new Object[] {
                view, s, s1, new UncloseableOutputStream(socket.getOutputStream())
            });
            obj1 = s1;
            obj = obj3;
            if (socket.isOutputShutdown())
            {
                break MISSING_BLOCK_LABEL_295;
            }
            obj1 = s1;
            obj = obj3;
            socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            socket.write("DONE\n");
            socket.flush();
            socket1 = socket;
            flag = flag1;
            if (socket1 == null)
            {
                break MISSING_BLOCK_LABEL_313;
            }
            socket1.close();
            flag = flag1;
_L5:
            return flag;
            socket;
            flag = false;
              goto _L5
            obj;
            s1 = ((String) (obj1));
            socket = obj2;
            obj1 = obj;
_L9:
            obj = socket;
            Log.w("ViewServer", (new StringBuilder()).append("Could not send command ").append(s).append(" with parameters ").append(s1).toString(), ((Throwable) (obj1)));
            flag1 = false;
            flag = flag1;
            if (socket == null) goto _L5; else goto _L6
_L6:
            socket.close();
            flag = flag1;
              goto _L5
            socket;
            flag = false;
              goto _L5
            socket;
_L8:
            if (obj != null)
            {
                try
                {
                    ((BufferedWriter) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (String s) { }
            }
            throw socket;
            s;
            obj = socket;
            socket = s;
            if (true) goto _L8; else goto _L7
_L7:
            obj1;
              goto _L9
        }

        private boolean windowManagerAutolistLoop()
        {
            Object obj;
            Object obj3;
            addWindowListener(this);
            obj = null;
            obj3 = null;
            Object obj1 = new BufferedWriter(new OutputStreamWriter(mClient.getOutputStream()));
_L7:
            if (Thread.interrupted()) goto _L2; else goto _L1
_L1:
            boolean flag;
            boolean flag1;
            flag = false;
            flag1 = false;
            obj = ((Object) (mLock));
            obj;
            JVM INSTR monitorenter ;
            while (!mNeedWindowListUpdate && !mNeedFocusedWindowUpdate) 
            {
                ((Object) (mLock)).wait();
            }
              goto _L3
            Object obj2;
            obj2;
            obj;
            JVM INSTR monitorexit ;
            throw obj2;
            obj2;
_L10:
            obj = obj1;
            Log.w("ViewServer", "Connection error: ", ((Throwable) (obj2)));
            if (obj1 != null)
            {
                try
                {
                    ((BufferedWriter) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            removeWindowListener(this);
            return true;
_L3:
            if (!mNeedWindowListUpdate)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            mNeedWindowListUpdate = false;
            flag = true;
            if (!mNeedFocusedWindowUpdate)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            mNeedFocusedWindowUpdate = false;
            flag1 = true;
            obj;
            JVM INSTR monitorexit ;
            if (!flag) goto _L5; else goto _L4
_L4:
            ((BufferedWriter) (obj1)).write("LIST UPDATE\n");
            ((BufferedWriter) (obj1)).flush();
_L5:
            if (!flag1) goto _L7; else goto _L6
_L6:
            ((BufferedWriter) (obj1)).write("FOCUS UPDATE\n");
            ((BufferedWriter) (obj1)).flush();
              goto _L7
            obj;
_L9:
            if (obj1 != null)
            {
                try
                {
                    ((BufferedWriter) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            removeWindowListener(this);
            throw obj;
_L2:
            if (obj1 != null)
            {
                try
                {
                    ((BufferedWriter) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            removeWindowListener(this);
            break MISSING_BLOCK_LABEL_112;
            obj2;
            obj1 = obj;
            obj = obj2;
            if (true) goto _L9; else goto _L8
_L8:
            obj2;
            obj1 = obj3;
              goto _L10
        }

        public void focusChanged()
        {
            synchronized (mLock)
            {
                mNeedFocusedWindowUpdate = true;
                ((Object) (mLock)).notifyAll();
            }
            return;
            exception;
            aobj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void run()
        {
            Object obj;
            Object obj2;
            obj = null;
            obj2 = null;
            Object obj1 = new BufferedReader(new InputStreamReader(mClient.getInputStream()), 1024);
            int i;
            obj2 = ((BufferedReader) (obj1)).readLine();
            i = ((String) (obj2)).indexOf(' ');
            if (i != -1) goto _L2; else goto _L1
_L1:
            obj = obj2;
            obj2 = "";
_L13:
            if (!"PROTOCOL".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
            boolean flag = ViewServer.writeValue(mClient, "4");
_L8:
            if (flag)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            Log.w("ViewServer", (new StringBuilder()).append("An error occurred with the command: ").append(((String) (obj))).toString());
            if (obj1 != null)
            {
                try
                {
                    ((BufferedReader) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (mClient == null) goto _L6; else goto _L5
_L5:
            mClient.close();
_L10:
            return;
_L2:
            try
            {
                obj = ((String) (obj2)).substring(0, i);
                obj2 = ((String) (obj2)).substring(i + 1);
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
            finally
            {
                obj = obj1;
                obj1 = obj2;
            }
              goto _L7
_L4:
label0:
            {
                if (!"SERVER".equalsIgnoreCase(((String) (obj))))
                {
                    break label0;
                }
                flag = ViewServer.writeValue(mClient, "4");
            }
              goto _L8
label1:
            {
                if (!"LIST".equalsIgnoreCase(((String) (obj))))
                {
                    break label1;
                }
                flag = listWindows(mClient);
            }
              goto _L8
label2:
            {
                if (!"GET_FOCUS".equalsIgnoreCase(((String) (obj))))
                {
                    break label2;
                }
                flag = getFocusedWindow(mClient);
            }
              goto _L8
label3:
            {
                if (!"AUTOLIST".equalsIgnoreCase(((String) (obj))))
                {
                    break label3;
                }
                flag = windowManagerAutolistLoop();
            }
              goto _L8
            flag = windowCommand(mClient, ((String) (obj)), ((String) (obj2)));
              goto _L8
            obj;
            ((IOException) (obj)).printStackTrace();
            return;
            obj;
            obj1 = obj2;
            obj2 = obj;
_L7:
            obj = obj1;
            Log.w("ViewServer", "Connection error: ", ((Throwable) (obj2)));
            if (obj1 != null)
            {
                try
                {
                    ((BufferedReader) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (mClient == null) goto _L10; else goto _L9
_L9:
            try
            {
                mClient.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
            obj1;
_L11:
            if (obj != null)
            {
                try
                {
                    ((BufferedReader) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            if (mClient != null)
            {
                try
                {
                    mClient.close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            throw obj1;
            if (true) goto _L11; else goto _L7
_L6:
            return;
            if (true) goto _L13; else goto _L12
_L12:
        }

        public void windowsChanged()
        {
            synchronized (mLock)
            {
                mNeedWindowListUpdate = true;
                ((Object) (mLock)).notifyAll();
            }
            return;
            exception;
            aobj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public ViewServerWorker(Socket socket)
        {
            this$0 = ViewServer.this;
            super();
            mClient = socket;
            mNeedWindowListUpdate = false;
            mNeedFocusedWindowUpdate = false;
        }
    }

    private static interface WindowListener
    {

        public abstract void focusChanged();

        public abstract void windowsChanged();
    }


    private static final String BUILD_TYPE_USER = "user";
    private static final String COMMAND_PROTOCOL_VERSION = "PROTOCOL";
    private static final String COMMAND_SERVER_VERSION = "SERVER";
    private static final String COMMAND_WINDOW_MANAGER_AUTOLIST = "AUTOLIST";
    private static final String COMMAND_WINDOW_MANAGER_GET_FOCUS = "GET_FOCUS";
    private static final String COMMAND_WINDOW_MANAGER_LIST = "LIST";
    private static final String LOG_TAG = "ViewServer";
    private static final String VALUE_PROTOCOL_VERSION = "4";
    private static final String VALUE_SERVER_VERSION = "4";
    private static final int VIEW_SERVER_DEFAULT_PORT = 4939;
    private static final int VIEW_SERVER_MAX_CONNECTIONS = 10;
    private static ViewServer sServer;
    private final ReentrantReadWriteLock mFocusLock;
    private View mFocusedWindow;
    private final List mListeners;
    private final int mPort;
    private ServerSocket mServer;
    private Thread mThread;
    private ExecutorService mThreadPool;
    private final HashMap mWindows;
    private final ReentrantReadWriteLock mWindowsLock;

    private ViewServer()
    {
        mListeners = new CopyOnWriteArrayList();
        mWindows = new HashMap();
        mWindowsLock = new ReentrantReadWriteLock();
        mFocusLock = new ReentrantReadWriteLock();
        mPort = -1;
    }

    private ViewServer(int i)
    {
        mListeners = new CopyOnWriteArrayList();
        mWindows = new HashMap();
        mWindowsLock = new ReentrantReadWriteLock();
        mFocusLock = new ReentrantReadWriteLock();
        mPort = i;
    }


    private void addWindowListener(WindowListener windowlistener)
    {
        if (!mListeners.contains(windowlistener))
        {
            mListeners.add(windowlistener);
        }
    }

    private void fireFocusChangedEvent()
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((WindowListener)iterator.next()).focusChanged()) { }
    }

    private void fireWindowsChangedEvent()
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((WindowListener)iterator.next()).windowsChanged()) { }
    }

    public static ViewServer get(Context context)
    {
        context = context.getApplicationInfo();
        if ("user".equals(Build.TYPE) && (((ApplicationInfo) (context)).flags & 2) != 0)
        {
            if (sServer == null)
            {
                sServer = new ViewServer(4939);
            }
            if (!sServer.isRunning())
            {
                try
                {
                    sServer.start();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.d("ViewServer", "Error:", context);
                }
            }
        } else
        {
            sServer = new NoopViewServer();
        }
        return sServer;
    }

    private void removeWindowListener(WindowListener windowlistener)
    {
        mListeners.remove(windowlistener);
    }

    private static boolean writeValue(Socket socket, String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        socket = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 8192);
        socket.write(s);
        socket.write("\n");
        socket.flush();
        boolean flag;
        flag = true;
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        try
        {
            socket.close();
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            return false;
        }
_L2:
        return flag;
        socket;
        socket = obj1;
_L5:
        flag = false;
        if (socket == null) goto _L2; else goto _L1
_L1:
        try
        {
            socket.close();
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            return false;
        }
        return false;
        socket;
        s = obj;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw socket;
        Exception exception;
        exception;
        s = socket;
        socket = exception;
        if (true) goto _L4; else goto _L3
_L3:
        s;
          goto _L5
        return true;
    }

    public void addWindow(Activity activity)
    {
        String s = activity.getTitle().toString();
        if (TextUtils.isEmpty(s))
        {
            s = (new StringBuilder()).append(activity.getClass().getCanonicalName()).append("/0x").append(System.identityHashCode(activity)).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append("(").append(activity.getClass().getCanonicalName()).append(")").toString();
        }
        addWindow(activity.getWindow().getDecorView(), s);
    }

    public void addWindow(View view, String s)
    {
        mWindowsLock.writeLock().lock();
        mWindows.put(view.getRootView(), s);
        mWindowsLock.writeLock().unlock();
        fireWindowsChangedEvent();
        return;
        view;
        mWindowsLock.writeLock().unlock();
        throw view;
    }

    public boolean isRunning()
    {
        return mThread != null && mThread.isAlive();
    }

    public void removeWindow(Activity activity)
    {
        removeWindow(activity.getWindow().getDecorView());
    }

    public void removeWindow(View view)
    {
        mWindowsLock.writeLock().lock();
        mWindows.remove(view.getRootView());
        mWindowsLock.writeLock().unlock();
        fireWindowsChangedEvent();
        return;
        view;
        mWindowsLock.writeLock().unlock();
        throw view;
    }

    public void run()
    {
        Object obj;
        try
        {
            mServer = new ServerSocket(mPort, 10, InetAddress.getLocalHost());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("ViewServer", "Starting ServerSocket error: ", ((Throwable) (obj)));
        }
_L2:
        if (mServer == null || Thread.currentThread() != mThread)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = mServer.accept();
        if (mThreadPool != null)
        {
            mThreadPool.submit(new ViewServerWorker(((Socket) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        ((Socket) (obj)).close();
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        try
        {
            ioexception.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w("ViewServer", "Connection error: ", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setFocusedWindow(Activity activity)
    {
        setFocusedWindow(activity.getWindow().getDecorView());
    }

    public void setFocusedWindow(View view)
    {
        mFocusLock.writeLock().lock();
        if (view != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        view = null;
_L1:
        mFocusedWindow = view;
        mFocusLock.writeLock().unlock();
        fireFocusChangedEvent();
        return;
        view = view.getRootView();
          goto _L1
        view;
        mFocusLock.writeLock().unlock();
        throw view;
    }

    public boolean start()
        throws IOException
    {
        if (mThread != null)
        {
            return false;
        } else
        {
            mThread = new Thread(this, (new StringBuilder()).append("Local View Server [port=").append(mPort).append("]").toString());
            mThreadPool = Executors.newFixedThreadPool(10);
            mThread.start();
            return true;
        }
    }

    public boolean stop()
    {
        if (mThread == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        mThread.interrupt();
        if (mThreadPool != null)
        {
            try
            {
                mThreadPool.shutdownNow();
            }
            catch (SecurityException securityexception)
            {
                Log.w("ViewServer", "Could not stop all view server threads");
            }
        }
        mThreadPool = null;
        mThread = null;
        mServer.close();
        mServer = null;
        return true;
        Object obj;
        obj;
        Log.w("ViewServer", "Could not close the view server");
        mWindowsLock.writeLock().lock();
        mWindows.clear();
        mWindowsLock.writeLock().unlock();
        mFocusLock.writeLock().lock();
        mFocusedWindow = null;
        mFocusLock.writeLock().unlock();
        return false;
        obj;
        mWindowsLock.writeLock().unlock();
        throw obj;
        obj;
        mFocusLock.writeLock().unlock();
        throw obj;
    }







}
