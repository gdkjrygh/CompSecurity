// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.ssl;

import ch.boye.httpclientandroidlib.conn.util.InetAddressUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.ssl:
//            X509HostnameVerifier

public abstract class AbstractVerifier
    implements X509HostnameVerifier
{

    private static final String BAD_COUNTRY_2LDS[] = {
        "ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", 
        "ne", "net", "or", "org"
    };

    public AbstractVerifier()
    {
    }

    public static boolean acceptableCountryWildcard(String s)
    {
        for (s = s.split("\\."); s.length != 3 || s[2].length() != 2 || Arrays.binarySearch(BAD_COUNTRY_2LDS, s[1]) < 0;)
        {
            return true;
        }

        return false;
    }

    public static int countDots(String s)
    {
        int j = 0;
        for (int i = 0; i < s.length();)
        {
            int k = j;
            if (s.charAt(i) == '.')
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public static String[] getCNs(X509Certificate x509certificate)
    {
        LinkedList linkedlist = new LinkedList();
        x509certificate = new StringTokenizer(x509certificate.getSubjectX500Principal().toString(), ",");
        do
        {
            if (!x509certificate.hasMoreTokens())
            {
                break;
            }
            String s = x509certificate.nextToken();
            int i = s.indexOf("CN=");
            if (i >= 0)
            {
                linkedlist.add(s.substring(i + 3));
            }
        } while (true);
        if (!linkedlist.isEmpty())
        {
            x509certificate = new String[linkedlist.size()];
            linkedlist.toArray(x509certificate);
            return x509certificate;
        } else
        {
            return null;
        }
    }

    public static String[] getDNSSubjectAlts(X509Certificate x509certificate)
    {
        return getSubjectAlts(x509certificate, null);
    }

    private static String[] getSubjectAlts(X509Certificate x509certificate, String s)
    {
        LinkedList linkedlist;
        byte byte0;
        if (isIPAddress(s))
        {
            byte0 = 7;
        } else
        {
            byte0 = 2;
        }
        linkedlist = new LinkedList();
        s = null;
        try
        {
            x509certificate = x509certificate.getSubjectAlternativeNames();
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            Logger.getLogger(ch/boye/httpclientandroidlib/conn/ssl/AbstractVerifier.getName()).log(Level.FINE, "Error parsing certificate.", x509certificate);
            x509certificate = s;
        }
        if (x509certificate != null)
        {
            x509certificate = x509certificate.iterator();
            do
            {
                if (!x509certificate.hasNext())
                {
                    break;
                }
                s = (List)x509certificate.next();
                if (((Integer)s.get(0)).intValue() == byte0)
                {
                    linkedlist.add((String)s.get(1));
                }
            } while (true);
        }
        if (!linkedlist.isEmpty())
        {
            x509certificate = new String[linkedlist.size()];
            linkedlist.toArray(x509certificate);
            return x509certificate;
        } else
        {
            return null;
        }
    }

    private static boolean isIPAddress(String s)
    {
        return s != null && (InetAddressUtils.isIPv4Address(s) || InetAddressUtils.isIPv6Address(s));
    }

    public final void verify(String s, X509Certificate x509certificate)
        throws SSLException
    {
        verify(s, getCNs(x509certificate), getSubjectAlts(x509certificate, s));
    }

    public final void verify(String s, SSLSocket sslsocket)
        throws IOException
    {
        if (s == null)
        {
            throw new NullPointerException("host to verify is null");
        }
        SSLSession sslsession1 = sslsocket.getSession();
        SSLSession sslsession = sslsession1;
        if (sslsession1 == null)
        {
            sslsocket.getInputStream().available();
            SSLSession sslsession2 = sslsocket.getSession();
            sslsession = sslsession2;
            if (sslsession2 == null)
            {
                sslsocket.startHandshake();
                sslsession = sslsocket.getSession();
            }
        }
        verify(s, (X509Certificate)sslsession.getPeerCertificates()[0]);
    }

    public final void verify(String s, String as[], String as1[], boolean flag)
        throws SSLException
    {
        Object obj = new LinkedList();
        if (as != null && as.length > 0 && as[0] != null)
        {
            ((LinkedList) (obj)).add(as[0]);
        }
        if (as1 != null)
        {
            int j = as1.length;
            for (int i = 0; i < j; i++)
            {
                as = as1[i];
                if (as != null)
                {
                    ((LinkedList) (obj)).add(as);
                }
            }

        }
        if (((LinkedList) (obj)).isEmpty())
        {
            throw new SSLException((new StringBuilder()).append("Certificate for <").append(s).append("> doesn't contain CN or DNS subjectAlt").toString());
        }
        as = new StringBuilder();
        as1 = s.trim().toLowerCase(Locale.ENGLISH);
        boolean flag3 = false;
        obj = ((LinkedList) (obj)).iterator();
        do
        {
            boolean flag2 = flag3;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = ((String)((Iterator) (obj)).next()).toLowerCase(Locale.ENGLISH);
            as.append(" <");
            as.append(s1);
            as.append('>');
            if (((Iterator) (obj)).hasNext())
            {
                as.append(" OR");
            }
            String as2[] = s1.split("\\.");
            boolean flag1;
            if (as2.length >= 3 && as2[0].endsWith("*") && acceptableCountryWildcard(s1) && !isIPAddress(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (as2[0].length() > 1)
                {
                    String s2 = as2[0].substring(0, as2.length - 2);
                    String s3 = s1.substring(as2[0].length());
                    String s4 = as1.substring(s2.length());
                    if (as1.startsWith(s2) && s4.endsWith(s3))
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                } else
                {
                    flag3 = as1.endsWith(s1.substring(1));
                }
                flag2 = flag3;
                if (flag3)
                {
                    flag2 = flag3;
                    if (flag)
                    {
                        if (countDots(as1) == countDots(s1))
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                    }
                }
            } else
            {
                flag2 = as1.equals(s1);
            }
            flag3 = flag2;
        } while (!flag2);
        if (!flag2)
        {
            throw new SSLException((new StringBuilder()).append("hostname in certificate didn't match: <").append(s).append("> !=").append(as).toString());
        } else
        {
            return;
        }
    }

    public final boolean verify(String s, SSLSession sslsession)
    {
        try
        {
            verify(s, (X509Certificate)sslsession.getPeerCertificates()[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    static 
    {
        Arrays.sort(BAD_COUNTRY_2LDS);
    }
}
