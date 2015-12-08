.class public Lcom/google/android/gms/drive/query/Query$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/query/Query;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zzadS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field private zzahH:Ljava/lang/String;

.field private zzahI:Lcom/google/android/gms/drive/query/SortOrder;

.field private zzahJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzahK:Z

.field private final zzahL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/drive/query/Filter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahL:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/Query;)V
    .locals 2
    .param p1, "query"    # Lcom/google/android/gms/drive/query/Query;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahL:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahL:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->getFilter()Lcom/google/android/gms/drive/query/Filter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->getPageToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahH:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->getSortOrder()Lcom/google/android/gms/drive/query/SortOrder;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->zzpZ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahJ:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->zzqa()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahK:Z

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->zzqb()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzadS:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public addFilter(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$Builder;
    .locals 1
    .param p1, "filter"    # Lcom/google/android/gms/drive/query/Filter;

    .prologue
    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahL:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public build()Lcom/google/android/gms/drive/query/Query;
    .locals 8

    new-instance v0, Lcom/google/android/gms/drive/query/Query;

    new-instance v1, Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    sget-object v2, Lcom/google/android/gms/drive/query/internal/Operator;->zzaim:Lcom/google/android/gms/drive/query/internal/Operator;

    iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahL:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/lang/Iterable;)V

    iget-object v2, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahH:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahJ:Ljava/util/List;

    iget-boolean v5, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahK:Z

    iget-object v6, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzadS:Ljava/util/Set;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/drive/query/Query;-><init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/Set;Lcom/google/android/gms/drive/query/Query$1;)V

    return-object v0
.end method

.method public setPageToken(Ljava/lang/String;)Lcom/google/android/gms/drive/query/Query$Builder;
    .locals 0
    .param p1, "token"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahH:Ljava/lang/String;

    return-object p0
.end method

.method public setSortOrder(Lcom/google/android/gms/drive/query/SortOrder;)Lcom/google/android/gms/drive/query/Query$Builder;
    .locals 0
    .param p1, "sortOrder"    # Lcom/google/android/gms/drive/query/SortOrder;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$Builder;->zzahI:Lcom/google/android/gms/drive/query/SortOrder;

    return-object p0
.end method
