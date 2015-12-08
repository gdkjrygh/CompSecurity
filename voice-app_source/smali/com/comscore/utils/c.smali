.class Lcom/comscore/utils/c;
.super Ljava/util/TimerTask;


# instance fields
.field final synthetic a:Lcom/comscore/utils/ConnectivityChangeReceiver;


# direct methods
.method constructor <init>(Lcom/comscore/utils/ConnectivityChangeReceiver;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/utils/c;->a:Lcom/comscore/utils/ConnectivityChangeReceiver;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/utils/c;->a:Lcom/comscore/utils/ConnectivityChangeReceiver;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/comscore/utils/ConnectivityChangeReceiver;->b(Z)V

    return-void
.end method
