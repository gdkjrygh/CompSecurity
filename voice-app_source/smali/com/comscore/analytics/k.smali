.class Lcom/comscore/analytics/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/comscore/analytics/Core;


# direct methods
.method constructor <init>(Lcom/comscore/analytics/Core;Z)V
    .locals 0

    iput-object p1, p0, Lcom/comscore/analytics/k;->b:Lcom/comscore/analytics/Core;

    iput-boolean p2, p0, Lcom/comscore/analytics/k;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-boolean v0, p0, Lcom/comscore/analytics/k;->a:Z

    sput-boolean v0, Lcom/comscore/utils/Constants;->DEBUG:Z

    return-void
.end method
