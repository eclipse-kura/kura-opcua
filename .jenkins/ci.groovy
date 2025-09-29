@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        buildType: "deploy",
        sonar: [
            enable: false,
            projectKey: "eclipse-kura_kura-opcua",
            tokenId: "sonarcloud-token-kura-opcua",
            exclusions: "tests/**/*.java"
        ],
    )
}
