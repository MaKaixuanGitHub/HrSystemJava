# hrsystem

1. ### 社内maven代理

  > 编辑%USER%\.m2\settings.xml文件的<mirrors>节点中，添加以下内容。

  ```xml
  <mirror>
  <id>nexus-dis</id>
  <mirrorOf>central</mirrorOf>
  <name>nexus dis</name>
  <url>http://192.168.9.50:8081/repository/maven-central/</url>
  </mirror>
  ```

  

2. ### NPM代理

  npm设置本地镜像

  ```sh
npm config set registry=http://192.168.9.50:8081/repository/npm-mirror
  
  npm install
  
  npm run dev
  ```
3. ### PostgreSQL命名规则
  > 在 PostgreSQL 中，使用双引号（`" "`)来引用标识符（如表名、列名等）是为了确保它们被精确地识别。这通常在以下几种情况下是必要的：
  
  1. **标识符大小写敏感**：如果你的表名或列名中包含大写字母或是以大写字母开头，PostgreSQL 会将未加引号的标识符转换为小写。因此，如果你希望保持原有的大小写格式，必须使用双引号。例如，`"USER_TEST"` 与 `USER_TEST` 是不同的；前者保留大写，后者会被转换为小写 `user_test`。
  
  2. **标识符包含特殊字符**：如果标识符包含空格、特殊字符（如 `-`、`$` 等），使用双引号是强制性的。
  
  3. **标识符是保留字**：如果标识符是 SQL 的保留字，必须用双引号括起来以避免语法冲突。例如，`user` 是一个保留字，而 `"user"` 则可以用作标识符。
  
  ### 示例
  
  假设你有一个表 `USER_TEST`，其中包含以下列：`userId`、`userName` 和 `age`。为了确保在查询中正确引用这些列名，使用双引号是必要的：
  
  ```sql
  SELECT "userId" as userId,
         "userName" as userName,
         "age"
  FROM "USER_TEST"
  WHERE "userId" = #{id}
  ```
  
  ### 解释
  
  - `SELECT "userId" as userId, "userName" as userName, "age"`:
    - 这里的 `userId` 和 `userName` 列名包含大写字母，所以使用双引号确保大小写敏感。
  - `FROM "USER_TEST"`:
    - 表名 `USER_TEST` 包含大写字母，因此需要使用双引号。
  - `WHERE "userId" = #{id}`:
    - 同样，`userId` 列名包含大写字母，所以使用双引号。
  
  ### 注意事项
  
  - **一致性**：在创建表和列时，最好保持一致的命名习惯。如果你决定使用小写字母和下划线（如 `user_test` 和 `user_id`），则可以避免使用双引号。
  - **性能**：双引号不会影响查询的性能，但会增加代码的可读性和维护复杂性。因此，建议在命名时尽量避免使用需要双引号的标识符。
  
  ### 推荐实践
  
  为了简化开发过程，通常建议使用小写字母和下划线来命名表和列。例如：
  
  ```sql
  CREATE TABLE user_test (
      user_id SERIAL PRIMARY KEY,
      user_name VARCHAR(50) NOT NULL,
      age INT
  );
  ```
  
  在这种情况下，你的查询可以写成：
  
  ```sql
  SELECT user_id as userId,
         user_name as userName,
         age
  FROM user_test
  WHERE user_id = #{id}
  ```
  
  这样可以避免使用双引号，从而减少代码的复杂性。
  
  
  