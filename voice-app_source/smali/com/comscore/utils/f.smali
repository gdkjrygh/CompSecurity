.class Lcom/comscore/utils/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/comscore/utils/Storage;


# direct methods
.method constructor <init>(Lcom/comscore/utils/Storage;)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/utils/f;->a:Lcom/comscore/utils/Storage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/comscore/utils/f;->a:Lcom/comscore/utils/Storage;

    invoke-virtual {v0}, Lcom/comscore/utils/Storage;->b()V

    iget-object v0, p0, Lcom/comscore/utils/f;->a:Lcom/comscore/utils/Storage;

    invoke-virtual {v0}, Lcom/comscore/utils/Storage;->c()V

    return-void
.end method
