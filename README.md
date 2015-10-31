# pep

<h:commandLink value="Submit" action="#{bean.submit}">
    <f:setPropertyActionListener target="#{bean.otherBean}" value="#{otherBean}" />
</h:commandLink>