.class public Lcom/google/android/gms/internal/zzht;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzhv;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzhv",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final zzGK:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final zzGM:Lcom/google/android/gms/internal/zzhw;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzht;->zzGK:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/zzhw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzhw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzht;->zzGM:Lcom/google/android/gms/internal/zzhw;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzht;->zzGM:Lcom/google/android/gms/internal/zzhw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzhw;->zzgy()V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 1
    .param p1, "mayInterruptIfRunning"    # Z

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/zzht;, "Lcom/google/android/gms/internal/zzht<TT;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzht;->zzGK:Ljava/lang/Object;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .param p1, "timeout"    # J
    .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/internal/zzht;, "Lcom/google/android/gms/internal/zzht<TT;>;"
    iget-object v0, p0, Lcom/google/android/gms/internal/zzht;->zzGK:Ljava/lang/Object;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzb(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzht;->zzGM:Lcom/google/android/gms/internal/zzhw;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzhw;->zzb(Ljava/lang/Runnable;)V

    return-void
.end method
