// Generated from D:/CompiladorJava/src/analisadorLexico\Java.g4 by ANTLR 4.7
package analisadorLexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaParser}.
 */
public interface JavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclarations(JavaParser.ImportDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclarations(JavaParser.ImportDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarations(JavaParser.TypeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassModifiers(JavaParser.ClassModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassModifiers(JavaParser.ClassModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#superRule}.
	 * @param ctx the parse tree
	 */
	void enterSuperRule(JavaParser.SuperRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#superRule}.
	 * @param ctx the parse tree
	 */
	void exitSuperRule(JavaParser.SuperRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(JavaParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaces}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(JavaParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclarations(JavaParser.ClassBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorModifiers}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifiers(JavaParser.ConstructorModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorModifiers}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifiers(JavaParser.ConstructorModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(JavaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(JavaParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(JavaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classTypeList}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeList(JavaParser.ClassTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classTypeList}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeList(JavaParser.ClassTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(JavaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(JavaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldModifiers}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifiers(JavaParser.FieldModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldModifiers}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifiers(JavaParser.FieldModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(JavaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(JavaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(JavaParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(JavaParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodModifiers}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifiers(JavaParser.MethodModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodModifiers}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifiers(JavaParser.MethodModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(JavaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(JavaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifiers(JavaParser.InterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifiers(JavaParser.InterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JavaParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclarations(JavaParser.InterfaceMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclarations(JavaParser.InterfaceMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#constantModifiers}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifiers(JavaParser.ConstantModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#constantModifiers}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifiers(JavaParser.ConstantModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#abstractMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethodDeclaration(JavaParser.AbstractMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#abstractMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethodDeclaration(JavaParser.AbstractMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#abstractMethodModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethodModifiers(JavaParser.AbstractMethodModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#abstractMethodModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethodModifiers(JavaParser.AbstractMethodModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#abstractMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterAbstractMethodModifier(JavaParser.AbstractMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#abstractMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitAbstractMethodModifier(JavaParser.AbstractMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#variableInitializers}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializers(JavaParser.VariableInitializersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#variableInitializers}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializers(JavaParser.VariableInitializersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(JavaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(JavaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(JavaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(JavaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(JavaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(JavaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(JavaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(JavaParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(JavaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(JavaParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(JavaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(JavaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(JavaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(JavaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(JavaParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#throwsStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowsStatement(JavaParser.ThrowsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#throwsStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowsStatement(JavaParser.ThrowsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(JavaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(JavaParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(JavaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(JavaParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(JavaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(JavaParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(JavaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(JavaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(JavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(JavaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(JavaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JavaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(JavaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(JavaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(JavaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(JavaParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JavaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(JavaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postdecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostdecrementExpression(JavaParser.PostdecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postdecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostdecrementExpression(JavaParser.PostdecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postincrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostincrementExpression(JavaParser.PostincrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postincrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostincrementExpression(JavaParser.PostincrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JavaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JavaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(JavaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(JavaParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(JavaParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(JavaParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(JavaParser.BooleanLiteralContext ctx);
}