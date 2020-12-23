# 描述
基于leecode editor插件的LeeCode实现代码
# 相关配置
## codeFileName
$!velocityTool.camelCaseName(${question.titleSlug})${question.frontendQuestionId}
## codeTemplete
```
package leetcode.editor.cn;

${question.content}

public class $!velocityTool.camelCaseName(${question.titleSlug})${question.frontendQuestionId}{
	public static void main(String[] args) {
		Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})${question.frontendQuestionId}().new Solution();
		
	}
	
${question.code}
}
```