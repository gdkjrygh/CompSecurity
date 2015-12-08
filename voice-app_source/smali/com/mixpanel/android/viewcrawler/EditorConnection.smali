.class Lcom/mixpanel/android/viewcrawler/EditorConnection;
.super Ljava/lang/Object;
.source "EditorConnection.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;,
        Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;,
        Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;,
        Lcom/mixpanel/android/viewcrawler/EditorConnection$WebSocketOutputStream;
    }
.end annotation


# static fields
.field private static final CONNECT_TIMEOUT:I = 0x1388

.field private static final EMPTY_BYTE_BUFFER:Ljava/nio/ByteBuffer;

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.EditorCnctn"


# instance fields
.field private final mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

.field private final mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

.field private final mURI:Ljava/net/URI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 171
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->EMPTY_BYTE_BUFFER:Ljava/nio/ByteBuffer;

    .line 173
    return-void
.end method

.method public constructor <init>(Ljava/net/URI;Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;Ljava/net/Socket;)V
    .locals 3
    .param p1, "uri"    # Ljava/net/URI;
    .param p2, "service"    # Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    .param p3, "sslSocket"    # Ljava/net/Socket;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    .line 50
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mURI:Ljava/net/URI;

    .line 52
    :try_start_0
    new-instance v1, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    const/16 v2, 0x1388

    invoke-direct {v1, p0, p1, v2, p3}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;-><init>(Lcom/mixpanel/android/viewcrawler/EditorConnection;Ljava/net/URI;ILjava/net/Socket;)V

    iput-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    .line 53
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    invoke-virtual {v1}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->connectBlocking()Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-void

    .line 54
    :catch_0
    move-exception v0

    .line 55
    .local v0, "e":Ljava/lang/InterruptedException;
    new-instance v1, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;

    invoke-direct {v1, p0, v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorConnectionException;-><init>(Lcom/mixpanel/android/viewcrawler/EditorConnection;Ljava/lang/Throwable;)V

    throw v1
.end method

.method static synthetic access$0(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mService:Lcom/mixpanel/android/viewcrawler/EditorConnection$Editor;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mURI:Ljava/net/URI;

    return-object v0
.end method

.method static synthetic access$2(Lcom/mixpanel/android/viewcrawler/EditorConnection;)Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    return-object v0
.end method

.method static synthetic access$3()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 171
    sget-object v0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->EMPTY_BYTE_BUFFER:Ljava/nio/ByteBuffer;

    return-object v0
.end method


# virtual methods
.method public getBufferedOutputStream()Ljava/io/BufferedOutputStream;
    .locals 3

    .prologue
    .line 64
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v1, Lcom/mixpanel/android/viewcrawler/EditorConnection$WebSocketOutputStream;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/mixpanel/android/viewcrawler/EditorConnection$WebSocketOutputStream;-><init>(Lcom/mixpanel/android/viewcrawler/EditorConnection;Lcom/mixpanel/android/viewcrawler/EditorConnection$WebSocketOutputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->isClosing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/EditorConnection;->mClient:Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;

    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/EditorConnection$EditorClient;->isFlushAndClose()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
